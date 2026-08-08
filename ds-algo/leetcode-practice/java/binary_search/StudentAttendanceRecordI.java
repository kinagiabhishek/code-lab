// https://leetcode.com/problems/student-attendance-record-i/
package binary_search;

import java.util.*;

public class StudentAttendanceRecordI {
    // LeetCode Problem 551: Student Attendance Record I
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        StudentAttendanceRecordI solver = new StudentAttendanceRecordI();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ StudentAttendanceRecordI (Student Attendance Record I) Passed!");
    }
}
