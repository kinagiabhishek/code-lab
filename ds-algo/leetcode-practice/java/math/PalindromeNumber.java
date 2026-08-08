// https://leetcode.com/problems/palindrome-number/
package math;

import java.util.*;

public class PalindromeNumber {
public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reverted = 0;
        while (x > reverted) {
            reverted = reverted * 10 + x % 10;
            x /= 10;
        }
        return x == reverted || x == reverted / 10;
    }
    public static void main(String[] args) {
        PalindromeNumber solver = new PalindromeNumber();
        assert solver.isPalindrome(121) == true;
        assert solver.isPalindrome(-121) == false;
        System.out.println("✅ PalindromeNumber Passed!");
    }
}
