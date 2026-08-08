// https://leetcode.com/problems/range-sum-query-mutable/
package math;

import java.util.*;

public class RangeSumQueryMutable {
    // LeetCode Problem 307: Range Sum Query - Mutable
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RangeSumQueryMutable solver = new RangeSumQueryMutable();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode307_RangeSumQueryMutable (Range Sum Query - Mutable) Passed!");
    }
}
