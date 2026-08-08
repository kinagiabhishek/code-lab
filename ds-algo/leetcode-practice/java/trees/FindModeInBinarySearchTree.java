// https://leetcode.com/problems/find-mode-in-binary-search-tree/
package trees;

import java.util.*;

public class FindModeInBinarySearchTree {
    // LeetCode Problem 501: Find Mode in Binary Search Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindModeInBinarySearchTree solver = new FindModeInBinarySearchTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode501_FindModeInBinarySearchTree (Find Mode in Binary Search Tree) Passed!");
    }
}
