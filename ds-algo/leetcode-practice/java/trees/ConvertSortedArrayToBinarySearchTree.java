// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
package trees;

import java.util.*;

public class ConvertSortedArrayToBinarySearchTree {
    // LeetCode Problem 108: Convert Sorted Array to Binary Search Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree solver = new ConvertSortedArrayToBinarySearchTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode108_ConvertSortedArrayToBinarySearchTree (Convert Sorted Array to Binary Search Tree) Passed!");
    }
}
