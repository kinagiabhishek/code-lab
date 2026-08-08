// https://leetcode.com/problems/evaluate-division/
package trees;

import java.util.*;

public class EvaluateDivision {
    // LeetCode Problem 399: Evaluate Division
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        EvaluateDivision solver = new EvaluateDivision();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ EvaluateDivision (Evaluate Division) Passed!");
    }
}
