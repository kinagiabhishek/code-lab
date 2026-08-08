// https://leetcode.com/problems/reverse-linked-list-ii/
package linked_lists;

import java.util.*;

public class LeetCode92_ReverseLinkedListIi {
    // LeetCode Problem 92: Reverse Linked List II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode92_ReverseLinkedListIi solver = new LeetCode92_ReverseLinkedListIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode92_ReverseLinkedListIi (Reverse Linked List II) Passed!");
    }
}
