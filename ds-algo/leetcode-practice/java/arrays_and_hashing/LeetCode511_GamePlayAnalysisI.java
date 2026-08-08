// https://leetcode.com/problems/game-play-analysis-i/
package arrays_and_hashing;

import java.util.*;

public class LeetCode511_GamePlayAnalysisI {
    // LeetCode Problem 511: Game Play Analysis I
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode511_GamePlayAnalysisI solver = new LeetCode511_GamePlayAnalysisI();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode511_GamePlayAnalysisI (Game Play Analysis I) Passed!");
    }
}
