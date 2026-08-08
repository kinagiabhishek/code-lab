// https://leetcode.com/problems/stack-queue-sequence-210/
package stacks_and_queues;

import java.util.*;

public class LeetCode210_StacksAndQueues210 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode210_StacksAndQueues210 solver = new LeetCode210_StacksAndQueues210();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode210_StacksAndQueues210 Passed!");
    }
}
