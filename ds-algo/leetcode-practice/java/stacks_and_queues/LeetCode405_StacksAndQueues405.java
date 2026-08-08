// https://leetcode.com/problems/stack-queue-sequence-405/
package stacks_and_queues;

import java.util.*;

public class LeetCode405_StacksAndQueues405 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode405_StacksAndQueues405 solver = new LeetCode405_StacksAndQueues405();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode405_StacksAndQueues405 Passed!");
    }
}
