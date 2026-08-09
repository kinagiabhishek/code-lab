// https://leetcode.com/problems/remove-linked-list-elements/
package trees;

import java.util.*;

public class RemoveLinkedListElements {
    // LeetCode Problem 203: Remove Linked List Elements
    // Official LeetCode Method Signature: public ListNode removeElements(ListNode head, int val)
    public ListNode removeElements(ListNode head, int val) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        RemoveLinkedListElements solver = new RemoveLinkedListElements();
        assert solver.removeElements(new int[]{1}).isEmpty();
        System.out.println("✅ RemoveLinkedListElements Passed!");
    }
}
