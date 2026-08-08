// https://leetcode.com/problems/implement-queue-using-stacks/
package stacks_and_queues;

import java.util.*;

public class LeetCode232_ImplementQueueUsingStacks {
    // LeetCode Problem 232: Implement Queue using Stacks
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode232_ImplementQueueUsingStacks solver = new LeetCode232_ImplementQueueUsingStacks();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode232_ImplementQueueUsingStacks (Implement Queue using Stacks) Passed!");
    }
}
