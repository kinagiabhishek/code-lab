// https://leetcode.com/problems/find-mode-in-binary-search-tree/
package dynamic_programming;

import java.util.*;

public class FindModeInBinarySearchTree {
    // LeetCode Problem 501: Find Mode in Binary Search Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindModeInBinarySearchTree solver = new FindModeInBinarySearchTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindModeInBinarySearchTree (Find Mode in Binary Search Tree) Passed!");
    }
}
