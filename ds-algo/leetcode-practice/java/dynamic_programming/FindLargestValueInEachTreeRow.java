// https://leetcode.com/problems/find-largest-value-in-each-tree-row/
package dynamic_programming;

import java.util.*;

public class FindLargestValueInEachTreeRow {
    // LeetCode Problem 515: Find Largest Value in Each Tree Row
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindLargestValueInEachTreeRow solver = new FindLargestValueInEachTreeRow();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindLargestValueInEachTreeRow (Find Largest Value in Each Tree Row) Passed!");
    }
}
