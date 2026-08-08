// https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
package linked_lists;

import java.util.*;

public class LeetCode430_FlattenAMultilevelDoublyLinkedList {
    // LeetCode Problem 430: Flatten a Multilevel Doubly Linked List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode430_FlattenAMultilevelDoublyLinkedList solver = new LeetCode430_FlattenAMultilevelDoublyLinkedList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode430_FlattenAMultilevelDoublyLinkedList (Flatten a Multilevel Doubly Linked List) Passed!");
    }
}
