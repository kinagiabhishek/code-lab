// https://leetcode.com/problems/stack-queue-sequence-496/
package stacks_and_queues;

import java.util.*;

public class LeetCode496_StacksAndQueues496 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode496_StacksAndQueues496 solver = new LeetCode496_StacksAndQueues496();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode496_StacksAndQueues496 Passed!");
    }
}
