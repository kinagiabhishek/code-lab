// https://leetcode.com/problems/stack-queue-sequence-327/
package stacks_and_queues;

import java.util.*;

public class LeetCode327_StacksAndQueues327 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode327_StacksAndQueues327 solver = new LeetCode327_StacksAndQueues327();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode327_StacksAndQueues327 Passed!");
    }
}
