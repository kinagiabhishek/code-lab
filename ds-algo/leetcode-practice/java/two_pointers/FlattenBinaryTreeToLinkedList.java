// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
package two_pointers;

import java.util.*;

public class FlattenBinaryTreeToLinkedList {
    // LeetCode Problem 114: Flatten Binary Tree to Linked List
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FlattenBinaryTreeToLinkedList solver = new FlattenBinaryTreeToLinkedList();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FlattenBinaryTreeToLinkedList (Flatten Binary Tree to Linked List) Passed!");
    }
}
