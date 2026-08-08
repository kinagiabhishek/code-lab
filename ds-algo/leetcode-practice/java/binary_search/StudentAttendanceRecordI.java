// https://leetcode.com/problems/student-attendance-record-i/
package binary_search;

import java.util.*;

public class StudentAttendanceRecordI {
    // LeetCode Problem 551: Student Attendance Record I
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxSoFar = nums[0], currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        StudentAttendanceRecordI solver = new StudentAttendanceRecordI();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ StudentAttendanceRecordI Passed!");
    }
}
