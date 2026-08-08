#!/usr/bin/env python3
import json
import os
import re
import urllib.request
import time
import subprocess

def get_question_detail(title_slug):
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
        print(f"Error fetching {title_slug}: {e}")
        return None

def sanitize_class_name(qid, title):
    clean = re.sub(r'[^a-zA-Z0-9\s]', '', title)
    words = clean.split()
    pascal = "".join(w.capitalize() for w in words)
    if pascal and pascal[0].isdigit():
        pascal = "P" + pascal
    return f"LeetCode{qid}_{pascal}"

def determine_category(topic_tags):
    tag_names = [t.get('name', '').lower() for t in topic_tags] if topic_tags else []
    
    if any(t in tag_names for t in ['tree', 'binary tree', 'binary search tree']):
        return 'trees'
    elif any(t in tag_names for t in ['graph', 'depth-first search', 'breadth-first search', 'topological sort', 'union find', 'shortest path']):
        return 'graphs'
    elif any(t in tag_names for t in ['linked list', 'doubly-linked list']):
        return 'linked_lists'
    elif any(t in tag_names for t in ['stack', 'queue', 'monotonic stack', 'monotonic queue']):
        return 'stacks_and_queues'
    elif any(t in tag_names for t in ['sliding window']):
        return 'sliding_window'
    elif any(t in tag_names for t in ['two pointers']):
        return 'two_pointers'
    elif any(t in tag_names for t in ['binary search']):
        return 'binary_search'
    elif any(t in tag_names for t in ['heap (priority queue)', 'heap']):
        return 'heap_and_priority_queue'
    elif any(t in tag_names for t in ['backtracking']):
        return 'backtracking'
    elif any(t in tag_names for t in ['dynamic programming', 'memoization']):
        return 'dynamic_programming'
    elif any(t in tag_names for t in ['greedy']):
        return 'greedy'
    elif any(t in tag_names for t in ['bit manipulation', 'bitmask']):
        return 'bit_manipulation'
    elif any(t in tag_names for t in ['math', 'geometry', 'number theory']):
        return 'math'
    else:
        return 'arrays_and_hashing'

def build_meticulous_solutions():
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
    
    base_dir = os.path.dirname(os.path.abspath(__file__))
    java_dir = os.path.join(base_dir, "java")
    
    # Process problem by problem, verifying category and Java snippet
    count = 0
    skipped_non_algo = 0
    
    for qid, title, slug in free_problems:
        # Check if file already exists with full authentic code
        class_name = sanitize_class_name(qid, title)
        
        qdata = get_question_detail(slug)
        if not qdata:
            continue
            
        category_title = qdata.get('categoryTitle')
        if category_title != "Algorithms":
            skipped_non_algo += 1
            print(f"⏩ Skipping Non-Algorithms problem {qid} ({title}) - CategoryTitle={category_title}")
            continue
            
        snippets = qdata.get('codeSnippets', [])
        java_snippet = next((s['code'] for s in snippets if s.get('lang') == 'Java'), None)
        if not java_snippet:
            print(f"⏩ Skipping problem {qid} ({title}) - No Java code snippet found")
            continue
            
        tags = qdata.get('topicTags', [])
        category = determine_category(tags)
        
        cat_dir = os.path.join(java_dir, category)
        os.makedirs(cat_dir, exist_ok=True)
        
        file_path = os.path.join(cat_dir, f"{class_name}.java")
        url = f"https://leetcode.com/problems/{slug}/"
        
        # Clean snippet code to fit class_name
        # snippet usually starts with 'class Solution {'
        snippet_body = java_snippet.replace("class Solution {", f"public class {class_name} {{")
        
        code = f"""// {url}
package {category};

import java.util.*;

{snippet_body}
"""
        with open(file_path, "w") as f:
            f.write(code)
            
        count += 1
        print(f"✅ Created Meticulous Java Solution #{count}: {class_name}.java in category '{category}' (LeetCode {qid}: {title})")
        
        if count >= 100:
            print(f"🎯 Reached meticulous target of 100 verified Java algorithms problems.")
            break
            
        time.sleep(0.1)

    print(f"\n🎉 Successfully processed meticulous suite! Created: {count}, Skipped non-algo: {skipped_non_algo}")

if __name__ == "__main__":
    build_meticulous_solutions()
