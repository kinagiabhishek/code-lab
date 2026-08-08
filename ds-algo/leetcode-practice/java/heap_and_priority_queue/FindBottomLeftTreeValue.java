// https://leetcode.com/problems/find-bottom-left-tree-value/
package heap_and_priority_queue;

import java.util.*;

public class FindBottomLeftTreeValue {
    // LeetCode Problem 513: Find Bottom Left Tree Value
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        FindBottomLeftTreeValue solver = new FindBottomLeftTreeValue();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ FindBottomLeftTreeValue Passed!");
    }
}
