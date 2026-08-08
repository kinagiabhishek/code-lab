#!/usr/bin/env python3
import sys
import os
import subprocess

def run_java_test(file_path):
    if not os.path.exists(file_path):
        print(f"❌ File not found: {file_path}")
        return False

    base_dir = os.path.dirname(os.path.dirname(os.path.abspath(file_path)))
    java_root = os.path.join(base_dir, "java")
    
    # Extract class name and package
    file_name = os.path.basename(file_path)
    class_name = file_name.replace(".java", "")
    folder_name = os.path.basename(os.path.dirname(file_path))
    
    full_class = f"{folder_name}.{class_name}"
    
    print(f"☕ Compiling & Testing Java Solution: {full_class}...")

    # Compile with OpenJDK
    env = os.environ.copy()
    env["PATH"] = f"/opt/homebrew/opt/openjdk/bin:{env.get('PATH', '')}"

    compile_cmd = ["javac", "-d", java_root, file_path]
    compile_res = subprocess.run(compile_cmd, capture_output=True, text=True, env=env)
    
    if compile_res.returncode != 0:
        print("❌ Java Compilation Failed:")
        print(compile_res.stderr)
        return False
        
    print("✅ Java Compilation Successful. Executing tests with -ea (enable assertions)...")
    exec_cmd = ["java", "-ea", "-cp", java_root, full_class]
    exec_res = subprocess.run(exec_cmd, capture_output=True, text=True, env=env)
    print(exec_res.stdout)
    
    if exec_res.returncode == 0:
        print(f"🎉 {class_name} PASSED ALL TESTS SUCCESSFULLY!")
        return True
    else:
        print(f"❌ Execution failed with return code {exec_res.returncode}")
        print(exec_res.stderr)
        return False

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python3 java_runner.py <path_to_java_file>")
        sys.exit(1)
    run_java_test(sys.argv[1])
