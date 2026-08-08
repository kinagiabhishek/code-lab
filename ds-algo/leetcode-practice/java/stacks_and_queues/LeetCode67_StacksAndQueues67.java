// https://leetcode.com/problems/stack-queue-sequence-67/
package stacks_and_queues;

import java.util.*;

public class LeetCode67_StacksAndQueues67 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode67_StacksAndQueues67 solver = new LeetCode67_StacksAndQueues67();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode67_StacksAndQueues67 Passed!");
    }
}
