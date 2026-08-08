// https://leetcode.com/problems/stack-queue-sequence-249/
package stacks_and_queues;

import java.util.*;

public class LeetCode249_StacksAndQueues249 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode249_StacksAndQueues249 solver = new LeetCode249_StacksAndQueues249();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode249_StacksAndQueues249 Passed!");
    }
}
