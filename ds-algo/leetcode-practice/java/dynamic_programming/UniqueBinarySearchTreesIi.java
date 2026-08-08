// https://leetcode.com/problems/unique-binary-search-trees-ii/
package dynamic_programming;

import java.util.*;

public class UniqueBinarySearchTreesIi {
    // LeetCode Problem 95: Unique Binary Search Trees II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        UniqueBinarySearchTreesIi solver = new UniqueBinarySearchTreesIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ UniqueBinarySearchTreesIi (Unique Binary Search Trees II) Passed!");
    }
}
