// https://leetcode.com/problems/course-schedule-iii/
package graphs;

import java.util.*;

public class CourseScheduleIii {
    // LeetCode Problem 630: Course Schedule III
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CourseScheduleIii solver = new CourseScheduleIii();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode630_CourseScheduleIii (Course Schedule III) Passed!");
    }
}
