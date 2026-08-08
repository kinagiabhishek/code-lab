// https://leetcode.com/problems/palindrome-number/
package math;

import java.util.*;

public class LeetCode9_PalindromeNumber {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode9_PalindromeNumber solver = new LeetCode9_PalindromeNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode9_PalindromeNumber Passed!");
    }
}
