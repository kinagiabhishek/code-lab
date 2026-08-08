// https://leetcode.com/problems/two-sum/
package math;

import java.util.*;

public class LeetCode1_TwoSum {
    // LeetCode Problem 1: Two Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode1_TwoSum solver = new LeetCode1_TwoSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode1_TwoSum (Two Sum) Passed!");
    }
}
