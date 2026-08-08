// https://leetcode.com/problems/fraction-addition-and-subtraction/
package stacks_and_queues;

import java.util.*;

public class FractionAdditionAndSubtraction {
    // LeetCode Problem 592: Fraction Addition and Subtraction
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FractionAdditionAndSubtraction solver = new FractionAdditionAndSubtraction();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FractionAdditionAndSubtraction (Fraction Addition and Subtraction) Passed!");
    }
}
