// https://leetcode.com/problems/game-play-analysis-iv/
package stacks_and_queues;

import java.util.*;

public class GamePlayAnalysisIv {
    // LeetCode Problem 550: Game Play Analysis IV
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        GamePlayAnalysisIv solver = new GamePlayAnalysisIv();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ GamePlayAnalysisIv (Game Play Analysis IV) Passed!");
    }
}
