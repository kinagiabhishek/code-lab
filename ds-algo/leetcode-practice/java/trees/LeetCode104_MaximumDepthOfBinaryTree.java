package trees;

public class LeetCode104_MaximumDepthOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
        LeetCode104_MaximumDepthOfBinaryTree solver = new LeetCode104_MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        assert solver.maxDepth(root) == 3;
        System.out.println("✅ LeetCode104_MaximumDepthOfBinaryTree Passed!");
    }
}
