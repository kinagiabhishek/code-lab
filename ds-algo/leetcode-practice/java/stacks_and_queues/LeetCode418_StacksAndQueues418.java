// https://leetcode.com/problems/stack-queue-sequence-418/
package stacks_and_queues;

import java.util.*;

public class LeetCode418_StacksAndQueues418 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode418_StacksAndQueues418 solver = new LeetCode418_StacksAndQueues418();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode418_StacksAndQueues418 Passed!");
    }
}
