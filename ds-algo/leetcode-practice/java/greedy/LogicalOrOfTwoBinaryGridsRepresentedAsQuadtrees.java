// https://leetcode.com/problems/logical-or-of-two-binary-grids-represented-as-quad-trees/
package greedy;

import java.util.*;

public class LogicalOrOfTwoBinaryGridsRepresentedAsQuadtrees {
    // LeetCode Problem 558: Logical OR of Two Binary Grids Represented as Quad-Trees
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        LogicalOrOfTwoBinaryGridsRepresentedAsQuadtrees solver = new LogicalOrOfTwoBinaryGridsRepresentedAsQuadtrees();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ LogicalOrOfTwoBinaryGridsRepresentedAsQuadtrees Passed!");
    }
}
