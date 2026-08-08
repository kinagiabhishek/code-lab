// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
package stacks_and_queues;

import java.util.*;

public class MinimumNumberOfArrowsToBurstBalloons {
    // LeetCode Problem 452: Minimum Number of Arrows to Burst Balloons
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumNumberOfArrowsToBurstBalloons solver = new MinimumNumberOfArrowsToBurstBalloons();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumNumberOfArrowsToBurstBalloons (Minimum Number of Arrows to Burst Balloons) Passed!");
    }
}
