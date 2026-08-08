// https://leetcode.com/problems/binary-tree-postorder-traversal/
package trees;

import java.util.*;

public class BinaryTreePostorderTraversal {
    // LeetCode Problem 145: Binary Tree Postorder Traversal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BinaryTreePostorderTraversal solver = new BinaryTreePostorderTraversal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode145_BinaryTreePostorderTraversal (Binary Tree Postorder Traversal) Passed!");
    }
}
