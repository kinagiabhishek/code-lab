// https://leetcode.com/problems/stack-queue-sequence-314/
package stacks_and_queues;

import java.util.*;

public class LeetCode314_StacksAndQueues314 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode314_StacksAndQueues314 solver = new LeetCode314_StacksAndQueues314();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode314_StacksAndQueues314 Passed!");
    }
}
