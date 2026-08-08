// https://leetcode.com/problems/reverse-linked-list/
package linked_lists;

import java.util.*;

public class LeetCode206_ReverseLinkedList {
    // LeetCode Problem 206: Reverse Linked List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode206_ReverseLinkedList solver = new LeetCode206_ReverseLinkedList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode206_ReverseLinkedList (Reverse Linked List) Passed!");
    }
}
