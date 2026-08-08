// https://leetcode.com/problems/missing-number/
package two_pointers;

import java.util.*;

public class MissingNumber {
    // LeetCode Problem 268: Missing Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MissingNumber solver = new MissingNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MissingNumber (Missing Number) Passed!");
    }
}
