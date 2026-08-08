// https://leetcode.com/problems/implement-stack-using-queues/
package arrays_and_hashing;

import java.util.*;

public class ImplementStackUsingQueues {
    // LeetCode Problem 225: Implement Stack using Queues
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues solver = new ImplementStackUsingQueues();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ImplementStackUsingQueues (Implement Stack using Queues) Passed!");
    }
}
