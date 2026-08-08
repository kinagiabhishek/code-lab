// https://leetcode.com/problems/stack-queue-sequence-444/
package stacks_and_queues;

import java.util.*;

public class LeetCode444_StacksAndQueues444 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode444_StacksAndQueues444 solver = new LeetCode444_StacksAndQueues444();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode444_StacksAndQueues444 Passed!");
    }
}
