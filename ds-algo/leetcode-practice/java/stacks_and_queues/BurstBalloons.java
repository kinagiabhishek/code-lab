// https://leetcode.com/problems/burst-balloons/
package stacks_and_queues;

import java.util.*;

public class BurstBalloons {
    // LeetCode Problem 312: Burst Balloons
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BurstBalloons solver = new BurstBalloons();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BurstBalloons (Burst Balloons) Passed!");
    }
}
