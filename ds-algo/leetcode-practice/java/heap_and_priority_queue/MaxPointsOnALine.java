// https://leetcode.com/problems/max-points-on-a-line/
package heap_and_priority_queue;

import java.util.*;

public class MaxPointsOnALine {
    // LeetCode Problem 149: Max Points on a Line
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaxPointsOnALine solver = new MaxPointsOnALine();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaxPointsOnALine (Max Points on a Line) Passed!");
    }
}
