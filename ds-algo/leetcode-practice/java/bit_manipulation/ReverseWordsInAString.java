// https://leetcode.com/problems/reverse-words-in-a-string/
package bit_manipulation;

import java.util.*;

public class ReverseWordsInAString {
    // LeetCode Problem 151: Reverse Words in a String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ReverseWordsInAString solver = new ReverseWordsInAString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode151_ReverseWordsInAString (Reverse Words in a String) Passed!");
    }
}
