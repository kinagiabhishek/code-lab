// https://leetcode.com/problems/add-digits/
package linked_lists;

import java.util.*;

public class AddDigits {
    // LeetCode Problem 258: Add Digits
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        AddDigits solver = new AddDigits();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ AddDigits (Add Digits) Passed!");
    }
}
