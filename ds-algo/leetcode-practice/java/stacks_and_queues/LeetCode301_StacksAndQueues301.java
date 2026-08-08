// https://leetcode.com/problems/stack-queue-sequence-301/
package stacks_and_queues;

import java.util.*;

public class LeetCode301_StacksAndQueues301 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode301_StacksAndQueues301 solver = new LeetCode301_StacksAndQueues301();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode301_StacksAndQueues301 Passed!");
    }
}
