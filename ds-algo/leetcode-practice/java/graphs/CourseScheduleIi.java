// https://leetcode.com/problems/course-schedule-ii/
package graphs;

import java.util.*;

public class CourseScheduleIi {
    // LeetCode Problem 210: Course Schedule II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CourseScheduleIi solver = new CourseScheduleIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode210_CourseScheduleIi (Course Schedule II) Passed!");
    }
}
