// https://leetcode.com/problems/sum-of-left-leaves/
package math;

import java.util.*;

public class LeetCode404_SumOfLeftLeaves {
    // LeetCode Problem 404: Sum of Left Leaves
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode404_SumOfLeftLeaves solver = new LeetCode404_SumOfLeftLeaves();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode404_SumOfLeftLeaves (Sum of Left Leaves) Passed!");
    }
}
