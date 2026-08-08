// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
package trees;
import java.util.Stack;
public class LeetCode230_KthSmallestElementInABST {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) { stack.push(root); root = root.left; }
            root = stack.pop();
            if (--k == 0) return root.val;
            root = root.right;
        }
        return -1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3); root.left = new TreeNode(1); root.right = new TreeNode(4);
        assert new LeetCode230_KthSmallestElementInABST().kthSmallest(root, 1) == 1;
        System.out.println("✅ LeetCode230_KthSmallestElementInABST Passed!");
    }
}
