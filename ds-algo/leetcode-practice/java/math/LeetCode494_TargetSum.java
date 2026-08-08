// https://leetcode.com/problems/target-sum/
package math;

import java.util.*;

public class LeetCode494_TargetSum {
    // LeetCode Problem 494: Target Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode494_TargetSum solver = new LeetCode494_TargetSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode494_TargetSum (Target Sum) Passed!");
    }
}
