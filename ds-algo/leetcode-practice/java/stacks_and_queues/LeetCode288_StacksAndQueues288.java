// https://leetcode.com/problems/stack-queue-sequence-288/
package stacks_and_queues;

import java.util.*;

public class LeetCode288_StacksAndQueues288 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode288_StacksAndQueues288 solver = new LeetCode288_StacksAndQueues288();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode288_StacksAndQueues288 Passed!");
    }
}
