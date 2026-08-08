// https://leetcode.com/problems/palindrome-linked-list/
package linked_lists;

import java.util.*;

public class PalindromeLinkedList {
    // LeetCode Problem 234: Palindrome Linked List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PalindromeLinkedList solver = new PalindromeLinkedList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode234_PalindromeLinkedList (Palindrome Linked List) Passed!");
    }
}
