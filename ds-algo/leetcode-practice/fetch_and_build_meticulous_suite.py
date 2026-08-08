#!/usr/bin/env python3
import json
import os
import re
import urllib.request
import time

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

def process_official_catalog():
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
    print(f"Total free problems to inspect: {len(free_problems)}")
    return free_problems

if __name__ == "__main__":
    problems = process_official_catalog()
    # Inspecting first 10 problems
    for qid, title, slug in problems[:10]:
        qdata = get_question_detail(slug)
        if qdata:
            cat_title = qdata.get('categoryTitle')
            tags = qdata.get('topicTags', [])
            snippets = qdata.get('codeSnippets', [])
            java_snippet = next((s['code'] for s in snippets if s.get('lang') == 'Java'), None)
            
            cat = determine_category(tags)
            print(f"✅ QID {qid} ({title}): CategoryTitle={cat_title}, TargetCategory={cat}, HasJava={java_snippet is not None}")
        time.sleep(0.2)
