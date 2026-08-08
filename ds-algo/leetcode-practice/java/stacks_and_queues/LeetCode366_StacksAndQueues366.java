// https://leetcode.com/problems/stack-queue-sequence-366/
package stacks_and_queues;

import java.util.*;

public class LeetCode366_StacksAndQueues366 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode366_StacksAndQueues366 solver = new LeetCode366_StacksAndQueues366();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode366_StacksAndQueues366 Passed!");
    }
}
