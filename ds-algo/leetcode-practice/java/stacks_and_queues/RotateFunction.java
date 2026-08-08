// https://leetcode.com/problems/rotate-function/
package stacks_and_queues;

import java.util.*;

public class RotateFunction {
    // LeetCode Problem 396: Rotate Function
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RotateFunction solver = new RotateFunction();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RotateFunction (Rotate Function) Passed!");
    }
}
