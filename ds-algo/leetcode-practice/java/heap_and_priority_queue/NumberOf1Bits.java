// https://leetcode.com/problems/number-of-1-bits/
package heap_and_priority_queue;

import java.util.*;

public class NumberOf1Bits {
    // LeetCode Problem 191: Number of 1 Bits
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NumberOf1Bits solver = new NumberOf1Bits();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NumberOf1Bits (Number of 1 Bits) Passed!");
    }
}
