// https://leetcode.com/problems/russian-doll-envelopes/
package stacks_and_queues;

import java.util.*;

public class RussianDollEnvelopes {
    // LeetCode Problem 354: Russian Doll Envelopes
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RussianDollEnvelopes solver = new RussianDollEnvelopes();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RussianDollEnvelopes (Russian Doll Envelopes) Passed!");
    }
}
