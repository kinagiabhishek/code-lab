// https://leetcode.com/problems/stack-queue-sequence-132/
package stacks_and_queues;

import java.util.*;

public class LeetCode132_StacksAndQueues132 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode132_StacksAndQueues132 solver = new LeetCode132_StacksAndQueues132();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode132_StacksAndQueues132 Passed!");
    }
}
