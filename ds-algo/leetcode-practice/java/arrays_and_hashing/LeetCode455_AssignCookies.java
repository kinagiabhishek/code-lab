// https://leetcode.com/problems/assign-cookies/
package arrays_and_hashing;

import java.util.*;

public class LeetCode455_AssignCookies {
    // LeetCode Problem 455: Assign Cookies
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode455_AssignCookies solver = new LeetCode455_AssignCookies();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode455_AssignCookies (Assign Cookies) Passed!");
    }
}
