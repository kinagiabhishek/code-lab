// https://leetcode.com/problems/valid-palindrome/
package two_pointers;
public class LeetCode125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            l++; r--;
        }
        return true;
    }
    public static void main(String[] args) {
        assert new LeetCode125_ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ LeetCode125_ValidPalindrome Passed!");
    }
}
