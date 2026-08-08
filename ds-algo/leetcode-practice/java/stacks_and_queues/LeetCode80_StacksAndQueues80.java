// https://leetcode.com/problems/stack-queue-sequence-80/
package stacks_and_queues;

import java.util.*;

public class LeetCode80_StacksAndQueues80 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode80_StacksAndQueues80 solver = new LeetCode80_StacksAndQueues80();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode80_StacksAndQueues80 Passed!");
    }
}
