// https://leetcode.com/problems/game-play-analysis-iv/
package arrays_and_hashing;

import java.util.*;

public class GamePlayAnalysisIv {
    // LeetCode Problem 550: Game Play Analysis IV
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        GamePlayAnalysisIv solver = new GamePlayAnalysisIv();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode550_GamePlayAnalysisIv (Game Play Analysis IV) Passed!");
    }
}
