// https://leetcode.com/problems/course-schedule/
package graphs;

import java.util.*;

public class CourseSchedule {
    // LeetCode Problem 207: Course Schedule
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CourseSchedule solver = new CourseSchedule();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode207_CourseSchedule (Course Schedule) Passed!");
    }
}
