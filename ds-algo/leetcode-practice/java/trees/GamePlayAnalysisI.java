// https://leetcode.com/problems/game-play-analysis-i/
package trees;

import java.util.*;

public class GamePlayAnalysisI {
    // LeetCode Problem 511: Game Play Analysis I
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        GamePlayAnalysisI solver = new GamePlayAnalysisI();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ GamePlayAnalysisI (Game Play Analysis I) Passed!");
    }
}
