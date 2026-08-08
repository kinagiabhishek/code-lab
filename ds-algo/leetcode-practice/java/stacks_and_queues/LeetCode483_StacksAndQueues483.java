// https://leetcode.com/problems/stack-queue-sequence-483/
package stacks_and_queues;

import java.util.*;

public class LeetCode483_StacksAndQueues483 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode483_StacksAndQueues483 solver = new LeetCode483_StacksAndQueues483();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode483_StacksAndQueues483 Passed!");
    }
}
