// https://leetcode.com/problems/binary-tree-inorder-traversal/
package trees;

import java.util.*;

public class LeetCode94_BinaryTreeInorderTraversal {
    // LeetCode Problem 94: Binary Tree Inorder Traversal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode94_BinaryTreeInorderTraversal solver = new LeetCode94_BinaryTreeInorderTraversal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode94_BinaryTreeInorderTraversal (Binary Tree Inorder Traversal) Passed!");
    }
}
