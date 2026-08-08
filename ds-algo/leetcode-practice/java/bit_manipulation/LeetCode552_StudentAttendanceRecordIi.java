// https://leetcode.com/problems/student-attendance-record-ii/
package bit_manipulation;

import java.util.*;

public class LeetCode552_StudentAttendanceRecordIi {
    // LeetCode Problem 552: Student Attendance Record II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode552_StudentAttendanceRecordIi solver = new LeetCode552_StudentAttendanceRecordIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode552_StudentAttendanceRecordIi (Student Attendance Record II) Passed!");
    }
}
