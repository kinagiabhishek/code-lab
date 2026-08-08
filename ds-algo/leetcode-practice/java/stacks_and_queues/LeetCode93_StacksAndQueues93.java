// https://leetcode.com/problems/stack-queue-sequence-93/
package stacks_and_queues;

import java.util.*;

public class LeetCode93_StacksAndQueues93 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode93_StacksAndQueues93 solver = new LeetCode93_StacksAndQueues93();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode93_StacksAndQueues93 Passed!");
    }
}
