#!/usr/bin/env python3
import os
import json

# Comprehensive database of classic LeetCode Java problems across categories
PROBLEMS = [
    # Arrays & Hashing
    ("arrays_and_hashing", "LeetCode217_ContainsDuplicate", 217, "Contains Duplicate", "Easy", "https://leetcode.com/problems/contains-duplicate/",
     """package arrays_and_hashing;
import java.util.HashSet;
import java.util.Set;

public class LeetCode217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        LeetCode217_ContainsDuplicate solver = new LeetCode217_ContainsDuplicate();
        assert solver.containsDuplicate(new int[]{1, 2, 3, 1}) == true;
        assert solver.containsDuplicate(new int[]{1, 2, 3, 4}) == false;
        System.out.println("✅ LeetCode217_ContainsDuplicate Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode242_ValidAnagram", 242, "Valid Anagram", "Easy", "https://leetcode.com/problems/valid-anagram/",
     """package arrays_and_hashing;

public class LeetCode242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        LeetCode242_ValidAnagram solver = new LeetCode242_ValidAnagram();
        assert solver.isAnagram("anagram", "nagaram") == true;
        assert solver.isAnagram("rat", "car") == false;
        System.out.println("✅ LeetCode242_ValidAnagram Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode49_GroupAnagrams", 49, "Group Anagrams", "Medium", "https://leetcode.com/problems/group-anagrams/",
     """package arrays_and_hashing;
import java.util.*;

public class LeetCode49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        LeetCode49_GroupAnagrams solver = new LeetCode49_GroupAnagrams();
        List<List<String>> res = solver.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        assert res.size() == 3;
        System.out.println("✅ LeetCode49_GroupAnagrams Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode347_TopKFrequentElements", 347, "Top K Frequent Elements", "Medium", "https://leetcode.com/problems/top-k-frequent-elements/",
     """package arrays_and_hashing;
import java.util.*;

public class LeetCode347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> countMap.get(a) - countMap.get(b));
        for (int num : countMap.keySet()) {
            pq.add(num);
            if (pq.size() > k) pq.poll();
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = pq.poll();
        return res;
    }
    public static void main(String[] args) {
        LeetCode347_TopKFrequentElements solver = new LeetCode347_TopKFrequentElements();
        int[] res = solver.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        assert res.length == 2;
        System.out.println("✅ LeetCode347_TopKFrequentElements Passed!");
    }
}"""),

    ("arrays_and_hashing", "LeetCode238_ProductOfArrayExceptSelf", 238, "Product of Array Except Self", "Medium", "https://leetcode.com/problems/product-of-array-except-self/",
     """package arrays_and_hashing;
import java.util.Arrays;

public class LeetCode238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) res[i] = res[i - 1] * nums[i - 1];
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode238_ProductOfArrayExceptSelf solver = new LeetCode238_ProductOfArrayExceptSelf();
        int[] res = solver.productExceptSelf(new int[]{1, 2, 3, 4});
        assert Arrays.equals(res, new int[]{24, 12, 8, 6});
        System.out.println("✅ LeetCode238_ProductOfArrayExceptSelf Passed!");
    }
}"""),

    # Two Pointers
    ("two_pointers", "LeetCode125_ValidPalindrome", 125, "Valid Palindrome", "Easy", "https://leetcode.com/problems/valid-palindrome/",
     """package two_pointers;

public class LeetCode125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        LeetCode125_ValidPalindrome solver = new LeetCode125_ValidPalindrome();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        assert solver.isPalindrome("race a car") == false;
        System.out.println("✅ LeetCode125_ValidPalindrome Passed!");
    }
}"""),

    ("two_pointers", "LeetCode11_ContainerWithMostWater", 11, "Container With Most Water", "Medium", "https://leetcode.com/problems/container-with-most-water/",
     """package two_pointers;

public class LeetCode11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int max = 0;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            max = Math.max(max, h * (r - l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }
    public static void main(String[] args) {
        LeetCode11_ContainerWithMostWater solver = new LeetCode11_ContainerWithMostWater();
        assert solver.maxArea(new int[]{1,8,6,2,5,4,8,3,7}) == 49;
        System.out.println("✅ LeetCode11_ContainerWithMostWater Passed!");
    }
}"""),

    # Sliding Window
    ("sliding_window", "LeetCode3_LongestSubstringWithoutRepeating", 3, "Longest Substring Without Repeating Characters", "Medium", "https://leetcode.com/problems/longest-substring-without-repeating-characters/",
     """package sliding_window;
import java.util.HashSet;
import java.util.Set;

public class LeetCode3_LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, maxLen = 0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LeetCode3_LongestSubstringWithoutRepeating solver = new LeetCode3_LongestSubstringWithoutRepeating();
        assert solver.lengthOfLongestSubstring("abcabcbb") == 3;
        assert solver.lengthOfLongestSubstring("bbbbb") == 1;
        System.out.println("✅ LeetCode3_LongestSubstringWithoutRepeating Passed!");
    }
}"""),

    ("sliding_window", "LeetCode76_MinimumWindowSubstring", 76, "Minimum Window Substring", "Hard", "https://leetcode.com/problems/minimum-window-substring/",
     """package sliding_window;
import java.util.HashMap;
import java.util.Map;

public class LeetCode76_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        int matched = 0, minLen = s.length() + 1, subStart = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                if (map.get(rightChar) >= 0) matched++;
            }
            while (matched == t.length()) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    subStart = l;
                }
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
    }
}"""),

    # Binary Search
    ("binary_search", "LeetCode704_BinarySearch", 704, "Binary Search", "Easy", "https://leetcode.com/problems/binary-search/",
     """package binary_search;

public class LeetCode704_BinarySearch {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        LeetCode704_BinarySearch solver = new LeetCode704_BinarySearch();
        assert solver.search(new int[]{-1,0,3,5,9,12}, 9) == 4;
        assert solver.search(new int[]{-1,0,3,5,9,12}, 2) == -1;
        System.out.println("✅ LeetCode704_BinarySearch Passed!");
    }
}"""),

    ("binary_search", "LeetCode33_SearchInRotatedSortedArray", 33, "Search in Rotated Sorted Array", "Medium", "https://leetcode.com/problems/search-in-rotated-sorted-array/",
     """package binary_search;

public class LeetCode33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target < nums[mid]) r = mid - 1;
                else l = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[r]) l = mid + 1;
                else r = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LeetCode33_SearchInRotatedSortedArray solver = new LeetCode33_SearchInRotatedSortedArray();
        assert solver.search(new int[]{4,5,6,7,0,1,2}, 0) == 4;
        assert solver.search(new int[]{4,5,6,7,0,1,2}, 3) == -1;
        System.out.println("✅ LeetCode33_SearchInRotatedSortedArray Passed!");
    }
}"""),

    # Dynamic Programming
    ("dynamic_programming", "LeetCode70_ClimbingStairs", 70, "Climbing Stairs", "Easy", "https://leetcode.com/problems/climbing-stairs/",
     """package dynamic_programming;

public class LeetCode70_ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        LeetCode70_ClimbingStairs solver = new LeetCode70_ClimbingStairs();
        assert solver.climbStairs(2) == 2;
        assert solver.climbStairs(3) == 3;
        assert solver.climbStairs(5) == 8;
        System.out.println("✅ LeetCode70_ClimbingStairs Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode322_CoinChange", 322, "Coin Change", "Medium", "https://leetcode.com/problems/coin-change/",
     """package dynamic_programming;
import java.util.Arrays;

public class LeetCode322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        LeetCode322_CoinChange solver = new LeetCode322_CoinChange();
        assert solver.coinChange(new int[]{1, 2, 5}, 11) == 3;
        assert solver.coinChange(new int[]{2}, 3) == -1;
        System.out.println("✅ LeetCode322_CoinChange Passed!");
    }
}"""),

    ("dynamic_programming", "LeetCode300_LongestIncreasingSubsequence", 300, "Longest Increasing Subsequence", "Medium", "https://leetcode.com/problems/longest-increasing-subsequence/",
     """package dynamic_programming;
import java.util.Arrays;

public class LeetCode300_LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int maxLIS = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLIS = Math.max(maxLIS, dp[i]);
        }
        return maxLIS;
    }
    public static void main(String[] args) {
        LeetCode300_LongestIncreasingSubsequence solver = new LeetCode300_LongestIncreasingSubsequence();
        assert solver.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}) == 4;
        System.out.println("✅ LeetCode300_LongestIncreasingSubsequence Passed!");
    }
}""")
]

def generate_all():
    base_dir = os.path.dirname(os.path.abspath(__file__))
    java_dir = os.path.join(base_dir, "java")
    
    generated_files = []
    
    for category, class_name, num, title, diff, link, code in PROBLEMS:
        cat_dir = os.path.join(java_dir, category)
        os.makedirs(cat_dir, exist_ok=True)
        file_path = os.path.join(cat_dir, f"{class_name}.java")
        
        with open(file_path, "w") as f:
            f.write(code.strip() + "\n")
            
        generated_files.append((category, class_name, num, title, diff, link, file_path))
        print(f"✨ Created: java/{category}/{class_name}.java [{diff}]")

    print(f"\n🎉 Successfully generated {len(generated_files)} Java LeetCode problem solutions!")
    return generated_files

if __name__ == "__main__":
    generate_all()
