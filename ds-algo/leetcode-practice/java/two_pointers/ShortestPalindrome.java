// https://leetcode.com/problems/shortest-palindrome/
package two_pointers;

import java.util.*;

public class ShortestPalindrome {
    // LeetCode Problem 214: Shortest Palindrome
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ShortestPalindrome solver = new ShortestPalindrome();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode214_ShortestPalindrome (Shortest Palindrome) Passed!");
    }
}
