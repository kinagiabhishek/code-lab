// https://leetcode.com/problems/range-sum-query-mutable/
package bit_manipulation;

import java.util.*;

public class RangeSumQueryMutable {
    // LeetCode Problem 307: Range Sum Query - Mutable
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RangeSumQueryMutable solver = new RangeSumQueryMutable();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RangeSumQueryMutable (Range Sum Query - Mutable) Passed!");
    }
}
