// https://leetcode.com/problems/stack-queue-sequence-236/
package stacks_and_queues;

import java.util.*;

public class LeetCode236_StacksAndQueues236 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode236_StacksAndQueues236 solver = new LeetCode236_StacksAndQueues236();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode236_StacksAndQueues236 Passed!");
    }
}
