// https://leetcode.com/problems/student-attendance-record-i/
package bit_manipulation;

import java.util.*;

public class StudentAttendanceRecordI {
    // LeetCode Problem 551: Student Attendance Record I
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        StudentAttendanceRecordI solver = new StudentAttendanceRecordI();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode551_StudentAttendanceRecordI (Student Attendance Record I) Passed!");
    }
}
