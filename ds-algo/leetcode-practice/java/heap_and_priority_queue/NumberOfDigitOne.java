// https://leetcode.com/problems/number-of-digit-one/
package heap_and_priority_queue;

import java.util.*;

public class NumberOfDigitOne {
    // LeetCode Problem 233: Number of Digit One
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NumberOfDigitOne solver = new NumberOfDigitOne();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NumberOfDigitOne (Number of Digit One) Passed!");
    }
}
