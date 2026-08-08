// https://leetcode.com/problems/stack-queue-sequence-379/
package stacks_and_queues;

import java.util.*;

public class LeetCode379_StacksAndQueues379 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode379_StacksAndQueues379 solver = new LeetCode379_StacksAndQueues379();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode379_StacksAndQueues379 Passed!");
    }
}
