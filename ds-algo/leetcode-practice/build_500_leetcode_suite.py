#!/usr/bin/env python3
import os
import sys

# Comprehensive list of 500+ LeetCode problems mapped across 13 core Data Structure categories
# Each tuple: (category, problem_number, problem_slug, class_name, code_body)

CATEGORIES = [
    "arrays_and_hashing", "two_pointers", "sliding_window", "stacks_and_queues",
    "binary_search", "linked_lists", "trees", "graphs", "heap_and_priority_queue",
    "backtracking", "dynamic_programming", "greedy", "bit_manipulation"
]

def generate_500_java_solutions():
    base_dir = os.path.dirname(os.path.abspath(__file__))
    java_dir = os.path.join(base_dir, "java")
    
    # Ensure category directories exist
    for cat in CATEGORIES:
        os.makedirs(os.path.join(java_dir, cat), exist_ok=True)
        
    count = 0
    
    # Template generator function for producing valid Java solutions with LeetCode URL as Line 1 comment
    def create_solution(category, num, slug, class_name, body):
        nonlocal count
        cat_dir = os.path.join(java_dir, category)
        file_path = os.path.join(cat_dir, f"{class_name}.java")
        url = f"https://leetcode.com/problems/{slug}/"
        
        full_code = f"// {url}\npackage {category};\n\n{body}\n"
        with open(file_path, "w") as f:
            f.write(full_code)
        count += 1

    # Load & build 500+ problem solutions
    import build_massive_database
    build_massive_database.populate_all(create_solution)
    
    print(f"🎉 Successfully generated {count} Java LeetCode solutions with line-1 LeetCode links!")

if __name__ == "__main__":
    generate_500_java_solutions()
