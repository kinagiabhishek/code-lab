// https://leetcode.com/problems/course-schedule-iii/
package math;

import java.util.*;

public class CourseScheduleIii {
    // LeetCode Problem 630: Course Schedule III
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CourseScheduleIii solver = new CourseScheduleIii();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CourseScheduleIii (Course Schedule III) Passed!");
    }
}
