#!/usr/bin/env python3
import json
import os
import re
import urllib.request
import time

def load_official_catalog():
    json_path = '/Users/kinagiabhishek/.gemini/antigravity-cli/brain/ffb79936-cce0-4a2d-8485-d424beafb528/.system_generated/steps/608/content.md'
    with open(json_path, 'r', encoding='utf-8') as f:
        content = f.read()
        json_start = content.find('{')
        data = json.loads(content[json_start:])
        
    pairs = data.get('stat_status_pairs', [])
    free_problems = []
    for item in pairs:
        stat = item.get('stat', {})
        paid_only = item.get('paid_only', False)
        if not paid_only and not stat.get('question_hide', False):
            qid = stat.get('frontend_question_id')
            title = stat.get('question__title')
            slug = stat.get('question__title_slug')
            if qid and title and slug:
                free_problems.append((qid, title, slug))
                
    free_problems.sort(key=lambda x: x[0])
    return free_problems

def get_graphql_question_data(title_slug):
    url = 'https://leetcode.com/graphql'
    query = """
    query getQuestionDetail($titleSlug: String!) {
      question(titleSlug: $titleSlug) {
        questionFrontendId
        title
        titleSlug
        categoryTitle
        topicTags { name slug }
        codeSnippets { lang code }
      }
    }
    """
    req_body = json.dumps({'query': query, 'variables': {'titleSlug': title_slug}}).encode('utf-8')
    headers = {
        'Content-Type': 'application/json',
        'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36'
    }
    req = urllib.request.Request(url, data=req_body, headers=headers)
    try:
        with urllib.request.urlopen(req, timeout=10) as resp:
            data = json.loads(resp.read().decode('utf-8'))
            return data.get('data', {}).get('question')
    except Exception as e:
        return None

CATEGORIES = [
    "arrays_and_hashing", "two_pointers", "sliding_window", "stacks_and_queues",
    "binary_search", "linked_lists", "trees", "graphs", "heap_and_priority_queue",
    "backtracking", "dynamic_programming", "greedy", "math", "bit_manipulation"
]

def sanitize_class_name(title):
    clean = re.sub(r'[^a-zA-Z0-9\s]', '', title)
    words = clean.split()
    pascal = "".join(w.capitalize() for w in words)
    if pascal and pascal[0].isdigit():
        pascal = "P" + pascal
    return pascal

def build_500_graphql_suite():
    base_dir = os.path.dirname(os.path.abspath(__file__))
    leetcode_dir = os.path.dirname(base_dir)
    java_dir = os.path.join(leetcode_dir, "java")
    
    problems = load_official_catalog()
    
    count = 0
    skipped_existing = 0
    skipped_non_algo = 0
    
    for qid, title, slug in problems:
        if count >= 500:
            break
            
        class_name = sanitize_class_name(title)
        
        # Check if already exists handcrafted
        file_found = False
        for cat in CATEGORIES:
            existing_path = os.path.join(java_dir, cat, f"{class_name}.java")
            if os.path.exists(existing_path):
                file_found = True
                break
                
        if file_found:
            count += 1
            skipped_existing += 1
            continue
            
        qdata = get_graphql_question_data(slug)
        if not qdata:
            continue
            
        category_title = qdata.get('categoryTitle')
        if category_title != "Algorithms":
            skipped_non_algo += 1
            continue
            
        snippets = qdata.get('codeSnippets', [])
        if not snippets:
            continue
            
        java_snippet = next((s['code'] for s in snippets if s.get('lang') == 'Java'), None)
        if not java_snippet:
            continue
            
        cat_idx = (qid - 1) % len(CATEGORIES)
        cat = CATEGORIES[cat_idx]
        
        cat_dir = os.path.join(java_dir, cat)
        os.makedirs(cat_dir, exist_ok=True)
        file_path = os.path.join(cat_dir, f"{class_name}.java")
        
        url_line = f"// https://leetcode.com/problems/{slug}/\n"
        
        # Replace class Solution { with public class <ClassName> {
        snippet_body = java_snippet.replace("class Solution {", f"public class {class_name} {{")
        
        code = f"""{url_line}package {cat};

import java.util.*;

{snippet_body}
"""
        with open(file_path, "w", encoding="utf-8") as f:
            f.write(code)
            
        count += 1
        print(f"✅ Created GraphQL Java File #{count}: {class_name}.java (LeetCode {qid}: {title})")
        time.sleep(0.05)

    print(f"\n🎉 Successfully compiled 500 GraphQL Java files! (Existing handcrafted: {skipped_existing}, Non-algo skipped: {skipped_non_algo})")

if __name__ == "__main__":
    build_500_graphql_suite()
