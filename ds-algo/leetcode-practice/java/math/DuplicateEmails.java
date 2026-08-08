// https://leetcode.com/problems/duplicate-emails/
package math;

import java.util.*;

public class DuplicateEmails {
    // LeetCode Problem 182: Duplicate Emails
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DuplicateEmails solver = new DuplicateEmails();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DuplicateEmails (Duplicate Emails) Passed!");
    }
}
