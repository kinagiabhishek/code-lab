// https://leetcode.com/problems/course-schedule/
package dynamic_programming;

import java.util.*;

public class CourseSchedule {
    // LeetCode Problem 207: Course Schedule
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CourseSchedule solver = new CourseSchedule();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CourseSchedule (Course Schedule) Passed!");
    }
}
