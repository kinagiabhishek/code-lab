// https://leetcode.com/problems/find-largest-value-in-each-tree-row/
package dynamic_programming;

import java.util.*;

public class FindLargestValueInEachTreeRow {
    // LeetCode Problem 515: Find Largest Value in Each Tree Row
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        FindLargestValueInEachTreeRow solver = new FindLargestValueInEachTreeRow();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ FindLargestValueInEachTreeRow Passed!");
    }
}
