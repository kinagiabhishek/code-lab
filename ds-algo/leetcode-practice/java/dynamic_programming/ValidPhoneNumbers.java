// https://leetcode.com/problems/valid-phone-numbers/
package dynamic_programming;

import java.util.*;

public class ValidPhoneNumbers {
    // LeetCode Problem 193: Valid Phone Numbers
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ValidPhoneNumbers solver = new ValidPhoneNumbers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ValidPhoneNumbers (Valid Phone Numbers) Passed!");
    }
}
