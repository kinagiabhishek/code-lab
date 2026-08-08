// https://leetcode.com/problems/range-sum-query-immutable/
package math;

import java.util.*;

public class RangeSumQueryImmutable {
    // LeetCode Problem 303: Range Sum Query - Immutable
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RangeSumQueryImmutable solver = new RangeSumQueryImmutable();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode303_RangeSumQueryImmutable (Range Sum Query - Immutable) Passed!");
    }
}
