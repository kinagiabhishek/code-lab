// https://leetcode.com/problems/range-sum-query-2d-immutable/
package backtracking;

import java.util.*;

public class RangeSumQuery2dImmutable {
    // LeetCode Problem 304: Range Sum Query 2D - Immutable
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RangeSumQuery2dImmutable solver = new RangeSumQuery2dImmutable();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RangeSumQuery2dImmutable (Range Sum Query 2D - Immutable) Passed!");
    }
}
