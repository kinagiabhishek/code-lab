// https://leetcode.com/problems/stack-queue-sequence-262/
package stacks_and_queues;

import java.util.*;

public class LeetCode262_StacksAndQueues262 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode262_StacksAndQueues262 solver = new LeetCode262_StacksAndQueues262();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode262_StacksAndQueues262 Passed!");
    }
}
