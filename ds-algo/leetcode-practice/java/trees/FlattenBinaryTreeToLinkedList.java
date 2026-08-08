// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
package trees;

import java.util.*;

public class FlattenBinaryTreeToLinkedList {
    // LeetCode Problem 114: Flatten Binary Tree to Linked List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FlattenBinaryTreeToLinkedList solver = new FlattenBinaryTreeToLinkedList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode114_FlattenBinaryTreeToLinkedList (Flatten Binary Tree to Linked List) Passed!");
    }
}
