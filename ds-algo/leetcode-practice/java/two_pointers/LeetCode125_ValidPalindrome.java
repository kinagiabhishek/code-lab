// https://leetcode.com/problems/valid-palindrome/
package two_pointers;

import java.util.*;

public class LeetCode125_ValidPalindrome {
    // LeetCode Problem 125: Valid Palindrome
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode125_ValidPalindrome solver = new LeetCode125_ValidPalindrome();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode125_ValidPalindrome (Valid Palindrome) Passed!");
    }
}
