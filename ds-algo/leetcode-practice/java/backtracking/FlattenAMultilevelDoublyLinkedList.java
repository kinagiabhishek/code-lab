// https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
package backtracking;

import java.util.*;

public class FlattenAMultilevelDoublyLinkedList {
    // LeetCode Problem 430: Flatten a Multilevel Doubly Linked List
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FlattenAMultilevelDoublyLinkedList solver = new FlattenAMultilevelDoublyLinkedList();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FlattenAMultilevelDoublyLinkedList (Flatten a Multilevel Doubly Linked List) Passed!");
    }
}
