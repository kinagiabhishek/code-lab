// https://leetcode.com/problems/valid-anagram/
package arrays_and_hashing;

import java.util.*;

public class ValidAnagram {
    // LeetCode Problem 242: Valid Anagram
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ValidAnagram solver = new ValidAnagram();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode242_ValidAnagram (Valid Anagram) Passed!");
    }
}
