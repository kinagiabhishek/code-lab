#!/usr/bin/env python3
import sys
import os
import subprocess

def run_test(file_path):
    if not os.path.exists(file_path):
        print(f"❌ File not found: {file_path}")
        return False

    print(f"🔨 Compiling & Testing: {os.path.basename(file_path)}...")
    bin_path = "/tmp/test_binary"
    
    # Compile
    compile_cmd = ["g++", "-std=c++17", "-O2", file_path, "-o", bin_path]
    compile_res = subprocess.run(compile_cmd, capture_output=True, text=True)
    
    if compile_res.returncode != 0:
        print("❌ Compilation Failed:")
        print(compile_res.stderr)
        return False
        
    print("✅ Compilation Successful. Executing tests...")
    exec_res = subprocess.run([bin_path], capture_output=True, text=True)
    print(exec_res.stdout)
    
    if exec_res.returncode == 0:
        print("🎉 ALL TESTS PASSED SUCCESSFULLY!")
        return True
    else:
        print(f"❌ Execution failed with return code {exec_res.returncode}")
        print(exec_res.stderr)
        return False

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python3 test_runner.py <path_to_cpp_file>")
        sys.exit(1)
    run_test(sys.argv[1])
