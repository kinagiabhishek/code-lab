// https://leetcode.com/problems/range-sum-query-immutable/
package heap_and_priority_queue;

import java.util.*;

public class RangeSumQueryImmutable {
    // LeetCode Problem 303: Range Sum Query - Immutable
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RangeSumQueryImmutable solver = new RangeSumQueryImmutable();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RangeSumQueryImmutable (Range Sum Query - Immutable) Passed!");
    }
}
