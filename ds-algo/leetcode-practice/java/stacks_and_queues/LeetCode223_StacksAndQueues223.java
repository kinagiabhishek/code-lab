// https://leetcode.com/problems/stack-queue-sequence-223/
package stacks_and_queues;

import java.util.*;

public class LeetCode223_StacksAndQueues223 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode223_StacksAndQueues223 solver = new LeetCode223_StacksAndQueues223();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode223_StacksAndQueues223 Passed!");
    }
}
