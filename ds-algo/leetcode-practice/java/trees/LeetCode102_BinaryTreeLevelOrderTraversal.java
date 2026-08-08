package trees;
import java.util.*;
public class LeetCode102_BinaryTreeLevelOrderTraversal {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int len = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode curr = q.poll();
                level.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            res.add(level);
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3); root.left = new TreeNode(9); root.right = new TreeNode(20);
        assert new LeetCode102_BinaryTreeLevelOrderTraversal().levelOrder(root).size() == 2;
        System.out.println("✅ LeetCode102_BinaryTreeLevelOrderTraversal Passed!");
    }
}
