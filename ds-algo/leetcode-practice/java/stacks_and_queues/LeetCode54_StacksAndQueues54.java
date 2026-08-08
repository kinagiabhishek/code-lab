// https://leetcode.com/problems/stack-queue-sequence-54/
package stacks_and_queues;

import java.util.*;

public class LeetCode54_StacksAndQueues54 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode54_StacksAndQueues54 solver = new LeetCode54_StacksAndQueues54();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode54_StacksAndQueues54 Passed!");
    }
}
