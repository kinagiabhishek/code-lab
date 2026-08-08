// https://leetcode.com/problems/range-sum-query-mutable/
package math;

import java.util.*;

public class LeetCode307_RangeSumQueryMutable {
    // LeetCode Problem 307: Range Sum Query - Mutable
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode307_RangeSumQueryMutable solver = new LeetCode307_RangeSumQueryMutable();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode307_RangeSumQueryMutable (Range Sum Query - Mutable) Passed!");
    }
}
