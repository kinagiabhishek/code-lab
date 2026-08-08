#!/usr/bin/env python3
import json
import os
import re

def scrape_official_leetcode():
    json_path = '/Users/kinagiabhishek/.gemini/antigravity-cli/brain/ffb79936-cce0-4a2d-8485-d424beafb528/.system_generated/steps/608/content.md'
    
    with open(json_path, 'r', encoding='utf-8') as f:
        content = f.read()
        # Find JSON object start
        json_start = content.find('{')
        raw_json = content[json_start:]
        data = json.loads(raw_json)
        
    pairs = data.get('stat_status_pairs', [])
    print(f"Total problems fetched directly from official LeetCode API: {len(pairs)}")
    
    # Filter free problems sorted by frontend_question_id
    free_problems = []
    for item in pairs:
        stat = item.get('stat', {})
        paid_only = item.get('paid_only', False)
        if not paid_only and stat.get('question_hide', False) == False:
            qid = stat.get('frontend_question_id')
            title = stat.get('question__title')
            slug = stat.get('question__title_slug')
            level = item.get('difficulty', {}).get('level', 1)
            if qid and title and slug:
                free_problems.append((qid, title, slug, level))
                
    free_problems.sort(key=lambda x: x[0])
    print(f"Total free authentic LeetCode problems available: {len(free_problems)}")
    
    return free_problems

if __name__ == "__main__":
    problems = scrape_official_leetcode()
    for p in problems[:20]:
        print(f"LeetCode {p[0]}: {p[1]} -> https://leetcode.com/problems/{p[2]}/ (Level {p[3]})")
