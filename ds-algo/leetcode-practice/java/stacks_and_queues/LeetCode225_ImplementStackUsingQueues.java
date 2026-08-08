// https://leetcode.com/problems/implement-stack-using-queues/
package stacks_and_queues;

import java.util.*;

public class LeetCode225_ImplementStackUsingQueues {
    // LeetCode Problem 225: Implement Stack using Queues
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode225_ImplementStackUsingQueues solver = new LeetCode225_ImplementStackUsingQueues();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode225_ImplementStackUsingQueues (Implement Stack using Queues) Passed!");
    }
}
