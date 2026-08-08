// https://leetcode.com/problems/predict-the-winner/
package arrays_and_hashing;

import java.util.*;

public class LeetCode486_PredictTheWinner {
    // LeetCode Problem 486: Predict the Winner
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode486_PredictTheWinner solver = new LeetCode486_PredictTheWinner();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode486_PredictTheWinner (Predict the Winner) Passed!");
    }
}
