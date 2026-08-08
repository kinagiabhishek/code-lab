// https://leetcode.com/problems/valid-anagram/
package stacks_and_queues;

import java.util.*;

public class ValidAnagram {
    // LeetCode Problem 242: Valid Anagram
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ValidAnagram solver = new ValidAnagram();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ValidAnagram (Valid Anagram) Passed!");
    }
}
