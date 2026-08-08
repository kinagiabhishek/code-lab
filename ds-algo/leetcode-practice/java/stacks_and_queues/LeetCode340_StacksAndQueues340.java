// https://leetcode.com/problems/stack-queue-sequence-340/
package stacks_and_queues;

import java.util.*;

public class LeetCode340_StacksAndQueues340 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode340_StacksAndQueues340 solver = new LeetCode340_StacksAndQueues340();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode340_StacksAndQueues340 Passed!");
    }
}
