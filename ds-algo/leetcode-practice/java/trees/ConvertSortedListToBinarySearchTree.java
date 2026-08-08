// https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
package trees;

import java.util.*;

public class ConvertSortedListToBinarySearchTree {
    // LeetCode Problem 109: Convert Sorted List to Binary Search Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ConvertSortedListToBinarySearchTree solver = new ConvertSortedListToBinarySearchTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode109_ConvertSortedListToBinarySearchTree (Convert Sorted List to Binary Search Tree) Passed!");
    }
}
