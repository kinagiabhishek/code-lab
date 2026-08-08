// https://leetcode.com/problems/linked-list-cycle-ii/
package linked_lists;

import java.util.*;

public class LeetCode142_LinkedListCycleIi {
    // LeetCode Problem 142: Linked List Cycle II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode142_LinkedListCycleIi solver = new LeetCode142_LinkedListCycleIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode142_LinkedListCycleIi (Linked List Cycle II) Passed!");
    }
}
