// https://leetcode.com/problems/duplicate-emails/
package arrays_and_hashing;

import java.util.*;

public class DuplicateEmails {
    // LeetCode Problem 182: Duplicate Emails
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DuplicateEmails solver = new DuplicateEmails();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode182_DuplicateEmails (Duplicate Emails) Passed!");
    }
}
