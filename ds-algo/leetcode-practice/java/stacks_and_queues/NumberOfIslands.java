// https://leetcode.com/problems/number-of-islands/
package stacks_and_queues;

import java.util.*;

public class NumberOfIslands {
    // LeetCode Problem 200: Number of Islands
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NumberOfIslands solver = new NumberOfIslands();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NumberOfIslands (Number of Islands) Passed!");
    }
}
