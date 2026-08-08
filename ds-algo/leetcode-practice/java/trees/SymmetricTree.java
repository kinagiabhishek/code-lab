// https://leetcode.com/problems/symmetric-tree/
package trees;

import java.util.*;

public class SymmetricTree {
public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
    }
    public static void main(String[] args) {
        SymmetricTree solver = new SymmetricTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2); root.right = new TreeNode(2);
        assert solver.isSymmetric(root) == true;
        System.out.println("✅ SymmetricTree Passed!");
    }
}
