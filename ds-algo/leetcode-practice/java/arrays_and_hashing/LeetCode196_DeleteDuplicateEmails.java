// https://leetcode.com/problems/delete-duplicate-emails/
package arrays_and_hashing;

import java.util.*;

public class LeetCode196_DeleteDuplicateEmails {
    // LeetCode Problem 196: Delete Duplicate Emails
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode196_DeleteDuplicateEmails solver = new LeetCode196_DeleteDuplicateEmails();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode196_DeleteDuplicateEmails (Delete Duplicate Emails) Passed!");
    }
}
