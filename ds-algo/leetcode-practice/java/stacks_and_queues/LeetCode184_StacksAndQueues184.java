// https://leetcode.com/problems/stack-queue-sequence-184/
package stacks_and_queues;

import java.util.*;

public class LeetCode184_StacksAndQueues184 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode184_StacksAndQueues184 solver = new LeetCode184_StacksAndQueues184();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode184_StacksAndQueues184 Passed!");
    }
}
