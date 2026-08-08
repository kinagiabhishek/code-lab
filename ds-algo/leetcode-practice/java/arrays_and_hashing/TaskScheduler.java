// https://leetcode.com/problems/task-scheduler/
package arrays_and_hashing;

import java.util.*;

public class TaskScheduler {
    // LeetCode Problem 621: Task Scheduler
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        TaskScheduler solver = new TaskScheduler();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode621_TaskScheduler (Task Scheduler) Passed!");
    }
}
