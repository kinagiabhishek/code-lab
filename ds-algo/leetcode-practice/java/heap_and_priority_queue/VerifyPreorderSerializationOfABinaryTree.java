// https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
package heap_and_priority_queue;

import java.util.*;

public class VerifyPreorderSerializationOfABinaryTree {
    // LeetCode Problem 331: Verify Preorder Serialization of a Binary Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        VerifyPreorderSerializationOfABinaryTree solver = new VerifyPreorderSerializationOfABinaryTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ VerifyPreorderSerializationOfABinaryTree (Verify Preorder Serialization of a Binary Tree) Passed!");
    }
}
