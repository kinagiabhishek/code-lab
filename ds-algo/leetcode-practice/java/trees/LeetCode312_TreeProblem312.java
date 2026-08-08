// https://leetcode.com/problems/problem-tree-312/
package trees;

import java.util.*;

public class LeetCode312_TreeProblem312 {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int solve(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(solve(root.left), solve(root.right));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        LeetCode312_TreeProblem312 solver = new LeetCode312_TreeProblem312();
        assert solver.solve(root) == 2;
        System.out.println("✅ LeetCode312_TreeProblem312 Passed!");
    }
}
