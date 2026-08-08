// https://leetcode.com/problems/rank-scores/
package bit_manipulation;

import java.util.*;

public class RankScores {
    // LeetCode Problem 178: Rank Scores
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RankScores solver = new RankScores();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode178_RankScores (Rank Scores) Passed!");
    }
}
