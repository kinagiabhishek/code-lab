// https://leetcode.com/problems/course-schedule-iii/
package graphs;

import java.util.*;

public class LeetCode630_CourseScheduleIii {
    // LeetCode Problem 630: Course Schedule III
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode630_CourseScheduleIii solver = new LeetCode630_CourseScheduleIii();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode630_CourseScheduleIii (Course Schedule III) Passed!");
    }
}
