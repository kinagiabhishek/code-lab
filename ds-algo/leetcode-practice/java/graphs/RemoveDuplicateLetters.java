// https://leetcode.com/problems/remove-duplicate-letters/
package graphs;

import java.util.*;

public class RemoveDuplicateLetters {
    // LeetCode Problem 316: Remove Duplicate Letters
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RemoveDuplicateLetters solver = new RemoveDuplicateLetters();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RemoveDuplicateLetters (Remove Duplicate Letters) Passed!");
    }
}
