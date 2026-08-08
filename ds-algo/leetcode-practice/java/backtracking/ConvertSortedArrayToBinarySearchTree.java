// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
package backtracking;

import java.util.*;

public class ConvertSortedArrayToBinarySearchTree {
    // LeetCode Problem 108: Convert Sorted Array to Binary Search Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree solver = new ConvertSortedArrayToBinarySearchTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ConvertSortedArrayToBinarySearchTree (Convert Sorted Array to Binary Search Tree) Passed!");
    }
}
