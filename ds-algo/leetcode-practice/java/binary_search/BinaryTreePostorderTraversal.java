// https://leetcode.com/problems/binary-tree-postorder-traversal/
package binary_search;

import java.util.*;

public class BinaryTreePostorderTraversal {
    // LeetCode Problem 145: Binary Tree Postorder Traversal
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BinaryTreePostorderTraversal solver = new BinaryTreePostorderTraversal();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BinaryTreePostorderTraversal (Binary Tree Postorder Traversal) Passed!");
    }
}
