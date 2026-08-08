// https://leetcode.com/problems/stack-queue-sequence-392/
package stacks_and_queues;

import java.util.*;

public class LeetCode392_StacksAndQueues392 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode392_StacksAndQueues392 solver = new LeetCode392_StacksAndQueues392();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode392_StacksAndQueues392 Passed!");
    }
}
