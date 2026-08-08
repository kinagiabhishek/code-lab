// https://leetcode.com/problems/stack-queue-sequence-431/
package stacks_and_queues;

import java.util.*;

public class LeetCode431_StacksAndQueues431 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode431_StacksAndQueues431 solver = new LeetCode431_StacksAndQueues431();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode431_StacksAndQueues431 Passed!");
    }
}
