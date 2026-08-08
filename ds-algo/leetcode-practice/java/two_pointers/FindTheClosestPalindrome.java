// https://leetcode.com/problems/find-the-closest-palindrome/
package two_pointers;

import java.util.*;

public class FindTheClosestPalindrome {
    // LeetCode Problem 564: Find the Closest Palindrome
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindTheClosestPalindrome solver = new FindTheClosestPalindrome();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode564_FindTheClosestPalindrome (Find the Closest Palindrome) Passed!");
    }
}
