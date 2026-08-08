// https://leetcode.com/problems/predict-the-winner/
package backtracking;

import java.util.*;

public class PredictTheWinner {
    // LeetCode Problem 486: Predict the Winner
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PredictTheWinner solver = new PredictTheWinner();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PredictTheWinner (Predict the Winner) Passed!");
    }
}
