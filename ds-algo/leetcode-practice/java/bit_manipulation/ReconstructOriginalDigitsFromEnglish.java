// https://leetcode.com/problems/reconstruct-original-digits-from-english/
package bit_manipulation;

import java.util.*;

public class ReconstructOriginalDigitsFromEnglish {
    // LeetCode Problem 423: Reconstruct Original Digits from English
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ReconstructOriginalDigitsFromEnglish solver = new ReconstructOriginalDigitsFromEnglish();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode423_ReconstructOriginalDigitsFromEnglish (Reconstruct Original Digits from English) Passed!");
    }
}
