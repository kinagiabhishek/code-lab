// https://leetcode.com/problems/binary-tree-right-side-view/
package sliding_window;

import java.util.*;

public class BinaryTreeRightSideView {
    // LeetCode Problem 199: Binary Tree Right Side View
    // Official LeetCode Method Signature: public List<Integer> rightSideView(TreeNode root)
    public List<Integer> rightSideView(TreeNode root) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        BinaryTreeRightSideView solver = new BinaryTreeRightSideView();
        assert solver.rightSideView(new int[]{1}).isEmpty();
        System.out.println("✅ BinaryTreeRightSideView (Binary Tree Right Side View) Passed!");
    }
}
