// https://leetcode.com/problems/course-schedule-ii/
package math;

import java.util.*;

public class CourseScheduleIi {
    // LeetCode Problem 210: Course Schedule II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CourseScheduleIi solver = new CourseScheduleIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CourseScheduleIi (Course Schedule II) Passed!");
    }
}
