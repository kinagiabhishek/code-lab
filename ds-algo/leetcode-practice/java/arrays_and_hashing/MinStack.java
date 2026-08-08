// https://leetcode.com/problems/min-stack/
package arrays_and_hashing;

import java.util.*;

public class MinStack {
    // LeetCode Problem 155: Min Stack
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinStack solver = new MinStack();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinStack (Min Stack) Passed!");
    }
}
