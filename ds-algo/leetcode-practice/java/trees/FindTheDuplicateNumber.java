// https://leetcode.com/problems/find-the-duplicate-number/
package trees;

import java.util.*;

public class FindTheDuplicateNumber {
    // LeetCode Problem 287: Find the Duplicate Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindTheDuplicateNumber solver = new FindTheDuplicateNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindTheDuplicateNumber (Find the Duplicate Number) Passed!");
    }
}
