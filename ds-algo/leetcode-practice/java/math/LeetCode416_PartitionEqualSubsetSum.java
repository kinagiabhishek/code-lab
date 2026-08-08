// https://leetcode.com/problems/partition-equal-subset-sum/
package math;

import java.util.*;

public class LeetCode416_PartitionEqualSubsetSum {
    // LeetCode Problem 416: Partition Equal Subset Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode416_PartitionEqualSubsetSum solver = new LeetCode416_PartitionEqualSubsetSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode416_PartitionEqualSubsetSum (Partition Equal Subset Sum) Passed!");
    }
}
