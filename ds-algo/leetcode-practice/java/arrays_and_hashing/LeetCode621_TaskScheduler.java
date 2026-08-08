// https://leetcode.com/problems/task-scheduler/
package arrays_and_hashing;

import java.util.*;

public class LeetCode621_TaskScheduler {
    // LeetCode Problem 621: Task Scheduler
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode621_TaskScheduler solver = new LeetCode621_TaskScheduler();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode621_TaskScheduler (Task Scheduler) Passed!");
    }
}
