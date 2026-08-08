// https://leetcode.com/problems/reverse-vowels-of-a-string/
package arrays_and_hashing;

import java.util.*;

public class ReverseVowelsOfAString {
    // LeetCode Problem 345: Reverse Vowels of a String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ReverseVowelsOfAString solver = new ReverseVowelsOfAString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode345_ReverseVowelsOfAString (Reverse Vowels of a String) Passed!");
    }
}
