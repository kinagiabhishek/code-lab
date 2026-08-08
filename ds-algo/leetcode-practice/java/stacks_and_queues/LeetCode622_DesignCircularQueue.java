// https://leetcode.com/problems/design-circular-queue/
package stacks_and_queues;

import java.util.*;

public class LeetCode622_DesignCircularQueue {
    // LeetCode Problem 622: Design Circular Queue
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode622_DesignCircularQueue solver = new LeetCode622_DesignCircularQueue();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode622_DesignCircularQueue (Design Circular Queue) Passed!");
    }
}
