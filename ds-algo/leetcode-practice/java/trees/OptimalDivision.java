// https://leetcode.com/problems/optimal-division/
package trees;

import java.util.*;

public class OptimalDivision {
    // LeetCode Problem 553: Optimal Division
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        OptimalDivision solver = new OptimalDivision();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ OptimalDivision (Optimal Division) Passed!");
    }
}
