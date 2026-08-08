// https://leetcode.com/problems/stack-queue-sequence-106/
package stacks_and_queues;

import java.util.*;

public class LeetCode106_StacksAndQueues106 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode106_StacksAndQueues106 solver = new LeetCode106_StacksAndQueues106();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode106_StacksAndQueues106 Passed!");
    }
}
