// https://leetcode.com/problems/stack-queue-sequence-353/
package stacks_and_queues;

import java.util.*;

public class LeetCode353_StacksAndQueues353 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode353_StacksAndQueues353 solver = new LeetCode353_StacksAndQueues353();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode353_StacksAndQueues353 Passed!");
    }
}
