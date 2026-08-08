// https://leetcode.com/problems/stack-queue-sequence-470/
package stacks_and_queues;

import java.util.*;

public class LeetCode470_StacksAndQueues470 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode470_StacksAndQueues470 solver = new LeetCode470_StacksAndQueues470();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode470_StacksAndQueues470 Passed!");
    }
}
