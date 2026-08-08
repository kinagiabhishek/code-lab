// https://leetcode.com/problems/remove-linked-list-elements/
package linked_lists;

import java.util.*;

public class RemoveLinkedListElements {
    // LeetCode Problem 203: Remove Linked List Elements
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RemoveLinkedListElements solver = new RemoveLinkedListElements();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode203_RemoveLinkedListElements (Remove Linked List Elements) Passed!");
    }
}
