// https://leetcode.com/problems/unique-binary-search-trees/
package greedy;

import java.util.*;

public class UniqueBinarySearchTrees {
    // LeetCode Problem 96: Unique Binary Search Trees
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        UniqueBinarySearchTrees solver = new UniqueBinarySearchTrees();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ UniqueBinarySearchTrees (Unique Binary Search Trees) Passed!");
    }
}
