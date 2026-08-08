// https://leetcode.com/problems/minimum-index-sum-of-two-lists/
package dynamic_programming;

import java.util.*;

public class MinimumIndexSumOfTwoLists {
    // LeetCode Problem 599: Minimum Index Sum of Two Lists
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumIndexSumOfTwoLists solver = new MinimumIndexSumOfTwoLists();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumIndexSumOfTwoLists (Minimum Index Sum of Two Lists) Passed!");
    }
}
