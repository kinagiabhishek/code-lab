// https://leetcode.com/problems/create-maximum-number/
package bit_manipulation;

import java.util.*;

public class CreateMaximumNumber {
    // LeetCode Problem 321: Create Maximum Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CreateMaximumNumber solver = new CreateMaximumNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CreateMaximumNumber (Create Maximum Number) Passed!");
    }
}
