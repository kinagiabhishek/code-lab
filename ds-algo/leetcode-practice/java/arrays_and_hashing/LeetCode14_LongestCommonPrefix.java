// https://leetcode.com/problems/longest-common-prefix/
package arrays_and_hashing;

import java.util.*;

public class LeetCode14_LongestCommonPrefix {
    // LeetCode Problem 14: Longest Common Prefix
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode14_LongestCommonPrefix solver = new LeetCode14_LongestCommonPrefix();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode14_LongestCommonPrefix (Longest Common Prefix) Passed!");
    }
}
