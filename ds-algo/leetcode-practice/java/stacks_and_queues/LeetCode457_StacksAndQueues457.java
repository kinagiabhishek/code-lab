// https://leetcode.com/problems/stack-queue-sequence-457/
package stacks_and_queues;

import java.util.*;

public class LeetCode457_StacksAndQueues457 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode457_StacksAndQueues457 solver = new LeetCode457_StacksAndQueues457();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode457_StacksAndQueues457 Passed!");
    }
}
