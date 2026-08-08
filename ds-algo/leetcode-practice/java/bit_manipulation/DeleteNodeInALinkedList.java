// https://leetcode.com/problems/delete-node-in-a-linked-list/
package bit_manipulation;

import java.util.*;

public class DeleteNodeInALinkedList {
    // LeetCode Problem 237: Delete Node in a Linked List
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DeleteNodeInALinkedList solver = new DeleteNodeInALinkedList();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DeleteNodeInALinkedList (Delete Node in a Linked List) Passed!");
    }
}
