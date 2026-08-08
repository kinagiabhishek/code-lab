// https://leetcode.com/problems/stack-queue-sequence-197/
package stacks_and_queues;

import java.util.*;

public class LeetCode197_StacksAndQueues197 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode197_StacksAndQueues197 solver = new LeetCode197_StacksAndQueues197();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode197_StacksAndQueues197 Passed!");
    }
}
