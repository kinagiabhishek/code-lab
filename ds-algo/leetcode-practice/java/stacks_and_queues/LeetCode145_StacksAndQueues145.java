// https://leetcode.com/problems/stack-queue-sequence-145/
package stacks_and_queues;

import java.util.*;

public class LeetCode145_StacksAndQueues145 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode145_StacksAndQueues145 solver = new LeetCode145_StacksAndQueues145();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode145_StacksAndQueues145 Passed!");
    }
}
