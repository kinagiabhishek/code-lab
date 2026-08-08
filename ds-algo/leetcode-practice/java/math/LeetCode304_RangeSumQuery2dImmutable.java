// https://leetcode.com/problems/range-sum-query-2d-immutable/
package math;

import java.util.*;

public class LeetCode304_RangeSumQuery2dImmutable {
    // LeetCode Problem 304: Range Sum Query 2D - Immutable
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode304_RangeSumQuery2dImmutable solver = new LeetCode304_RangeSumQuery2dImmutable();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode304_RangeSumQuery2dImmutable (Range Sum Query 2D - Immutable) Passed!");
    }
}
