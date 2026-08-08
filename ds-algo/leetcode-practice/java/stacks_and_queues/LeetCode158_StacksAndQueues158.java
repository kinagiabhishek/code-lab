// https://leetcode.com/problems/stack-queue-sequence-158/
package stacks_and_queues;

import java.util.*;

public class LeetCode158_StacksAndQueues158 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode158_StacksAndQueues158 solver = new LeetCode158_StacksAndQueues158();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode158_StacksAndQueues158 Passed!");
    }
}
