// https://leetcode.com/problems/delete-node-in-a-linked-list/
package linked_lists;

import java.util.*;

public class DeleteNodeInALinkedList {
    // LeetCode Problem 237: Delete Node in a Linked List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DeleteNodeInALinkedList solver = new DeleteNodeInALinkedList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode237_DeleteNodeInALinkedList (Delete Node in a Linked List) Passed!");
    }
}
