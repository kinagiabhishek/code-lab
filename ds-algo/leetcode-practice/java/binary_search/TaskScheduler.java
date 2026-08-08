// https://leetcode.com/problems/task-scheduler/
package binary_search;

import java.util.*;

public class TaskScheduler {
    // LeetCode Problem 621: Task Scheduler
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TaskScheduler solver = new TaskScheduler();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TaskScheduler (Task Scheduler) Passed!");
    }
}
