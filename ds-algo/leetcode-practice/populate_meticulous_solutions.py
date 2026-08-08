#!/usr/bin/env python3
import os

METICULOUS_SOLUTIONS = {
    "LeetCode1_TwoSum": """
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) return new int[] { map.get(comp), i };
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        LeetCode1_TwoSum solver = new LeetCode1_TwoSum();
        assert Arrays.equals(solver.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        System.out.println("✅ LeetCode1_TwoSum Passed!");
    }""",

    "LeetCode56_MergeIntervals": """
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);
        for (int[] interval : intervals) {
            if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                current = interval;
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        LeetCode56_MergeIntervals solver = new LeetCode56_MergeIntervals();
        int[][] res = solver.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        assert res.length == 3;
        System.out.println("✅ LeetCode56_MergeIntervals Passed!");
    }""",

    "LeetCode42_TrappingRainWater": """
    public int trap(int[] height) {
        int l = 0, r = height.length - 1, leftMax = 0, rightMax = 0, ans = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= leftMax) leftMax = height[l]; else ans += (leftMax - height[l]);
                l++;
            } else {
                if (height[r] >= rightMax) rightMax = height[r]; else ans += (rightMax - height[r]);
                r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        LeetCode42_TrappingRainWater solver = new LeetCode42_TrappingRainWater();
        assert solver.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}) == 6;
        System.out.println("✅ LeetCode42_TrappingRainWater Passed!");
    }""",

    "LeetCode76_MinimumWindowSubstring": """
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        int matched = 0, minLen = s.length() + 1, subStart = 0, l = 0;
        for (int r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                if (map.get(rightChar) >= 0) matched++;
            }
            while (matched == t.length()) {
                if (r - l + 1 < minLen) { minLen = r - l + 1; subStart = l; }
                char leftChar = s.charAt(l);
                if (map.containsKey(leftChar)) {
                    if (map.get(leftChar) == 0) matched--;
                    map.put(leftChar, map.get(leftChar) + 1);
                }
                l++;
            }
        }
        return minLen > s.length() ? "" : s.substring(subStart, subStart + minLen);
    }
    public static void main(String[] args) {
        LeetCode76_MinimumWindowSubstring solver = new LeetCode76_MinimumWindowSubstring();
        assert solver.minWindow("ADOBECODEBANC", "ABC").equals("BANC");
        System.out.println("✅ LeetCode76_MinimumWindowSubstring Passed!");
    }"""
}

def fill_solutions():
    base_dir = os.path.dirname(os.path.abspath(__file__))
    java_dir = os.path.join(base_dir, "java")
    
    updated = 0
    for root, dirs, files in os.walk(java_dir):
        for file in files:
            if file.endswith(".java"):
                class_name = file[:-5]
                if class_name in METICULOUS_SOLUTIONS:
                    file_path = os.path.join(root, file)
                    with open(file_path, "r") as f:
                        lines = f.readlines()
                    url_line = lines[0]
                    pkg_line = lines[1]
                    
                    sol_code = METICULOUS_SOLUTIONS[class_name]
                    
                    full_code = f"""{url_line.strip()}
{pkg_line.strip()}

import java.util.*;

public class {class_name} {{
{sol_code.rstrip()}
}}
"""
                    with open(file_path, "w") as f:
                        f.write(full_code)
                    updated += 1
                    print(f"✅ Populated optimal solution with main test for {class_name}.java")
                    
    print(f"\n🎉 Successfully updated {updated} meticulous solution files with local test main methods!")

if __name__ == "__main__":
    fill_solutions()
