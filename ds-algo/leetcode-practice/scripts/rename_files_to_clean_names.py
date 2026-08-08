#!/usr/bin/env python3
import os
import re

def rename_to_clean_problem_names():
    base_dir = os.path.dirname(os.path.abspath(__file__))
    java_dir = os.path.join(base_dir, "java")
    
    renamed_count = 0
    
    for root, dirs, files in os.walk(java_dir):
        for file in files:
            if file.endswith(".java") and file.startswith("LeetCode"):
                file_path = os.path.join(root, file)
                
                # Match LeetCode<ID>_<ProblemName>.java
                m = re.match(r'LeetCode\d+_(.*)\.java$', file)
                if m:
                    clean_name = m.group(1)
                    new_file_name = f"{clean_name}.java"
                    new_file_path = os.path.join(root, new_file_name)
                    
                    with open(file_path, "r", encoding="utf-8") as f:
                        content = f.read()
                        
                    old_class_name = file[:-5]
                    new_class_name = clean_name
                    
                    # Replace old class name with new class name
                    new_content = content.replace(f"public class {old_class_name}", f"public class {new_class_name}")
                    new_content = new_content.replace(f"{old_class_name} solver", f"{new_class_name} solver")
                    new_content = new_content.replace(f"new {old_class_name}()", f"new {new_class_name}()")
                    
                    # Remove old file if path differs
                    if file_path != new_file_path:
                        os.remove(file_path)
                        
                    with open(new_file_path, "w", encoding="utf-8") as f:
                        f.write(new_content)
                        
                    renamed_count += 1
                    print(f"✅ Renamed: {file} -> {new_file_name}")

    print(f"\n🎉 Successfully renamed {renamed_count} Java files to clean problem names!")

if __name__ == "__main__":
    rename_to_clean_problem_names()
