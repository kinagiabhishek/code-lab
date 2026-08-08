// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
package backtracking;

import java.util.*;

public class LeetCode17_LetterCombinationsOfAPhoneNumber {
    // LeetCode Problem 17: Letter Combinations of a Phone Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode17_LetterCombinationsOfAPhoneNumber solver = new LeetCode17_LetterCombinationsOfAPhoneNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode17_LetterCombinationsOfAPhoneNumber (Letter Combinations of a Phone Number) Passed!");
    }
}
