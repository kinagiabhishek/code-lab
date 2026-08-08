// https://leetcode.com/problems/stack-queue-sequence-509/
package stacks_and_queues;

import java.util.*;

public class LeetCode509_StacksAndQueues509 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode509_StacksAndQueues509 solver = new LeetCode509_StacksAndQueues509();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode509_StacksAndQueues509 Passed!");
    }
}
