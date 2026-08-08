// https://leetcode.com/problems/stack-queue-sequence-275/
package stacks_and_queues;

import java.util.*;

public class LeetCode275_StacksAndQueues275 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode275_StacksAndQueues275 solver = new LeetCode275_StacksAndQueues275();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode275_StacksAndQueues275 Passed!");
    }
}
