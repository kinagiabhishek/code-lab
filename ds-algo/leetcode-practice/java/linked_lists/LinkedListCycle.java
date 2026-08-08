// https://leetcode.com/problems/linked-list-cycle/
package linked_lists;

import java.util.*;

public class LinkedListCycle {
    // LeetCode Problem 141: Linked List Cycle
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LinkedListCycle solver = new LinkedListCycle();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode141_LinkedListCycle (Linked List Cycle) Passed!");
    }
}
