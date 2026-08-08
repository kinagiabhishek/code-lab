// https://leetcode.com/problems/stack-queue-sequence-119/
package stacks_and_queues;

import java.util.*;

public class LeetCode119_StacksAndQueues119 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode119_StacksAndQueues119 solver = new LeetCode119_StacksAndQueues119();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode119_StacksAndQueues119 Passed!");
    }
}
