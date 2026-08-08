// https://leetcode.com/problems/stack-queue-sequence-171/
package stacks_and_queues;

import java.util.*;

public class LeetCode171_StacksAndQueues171 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode171_StacksAndQueues171 solver = new LeetCode171_StacksAndQueues171();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode171_StacksAndQueues171 Passed!");
    }
}
