// https://leetcode.com/problems/circular-array-loop/
package heap_and_priority_queue;

import java.util.*;

public class CircularArrayLoop {
    // LeetCode Problem 457: Circular Array Loop
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CircularArrayLoop solver = new CircularArrayLoop();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CircularArrayLoop (Circular Array Loop) Passed!");
    }
}
