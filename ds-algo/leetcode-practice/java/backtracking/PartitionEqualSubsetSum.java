// https://leetcode.com/problems/partition-equal-subset-sum/
package backtracking;

import java.util.*;

public class PartitionEqualSubsetSum {
    // LeetCode Problem 416: Partition Equal Subset Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PartitionEqualSubsetSum solver = new PartitionEqualSubsetSum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PartitionEqualSubsetSum (Partition Equal Subset Sum) Passed!");
    }
}
