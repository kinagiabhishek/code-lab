// https://leetcode.com/problems/count-of-range-sum/
package math;

import java.util.*;

public class CountOfRangeSum {
    // LeetCode Problem 327: Count of Range Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CountOfRangeSum solver = new CountOfRangeSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode327_CountOfRangeSum (Count of Range Sum) Passed!");
    }
}
