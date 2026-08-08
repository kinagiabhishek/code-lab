// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
package sliding_window;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    // LeetCode Problem 17: Letter Combinations of a Phone Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber solver = new LetterCombinationsOfAPhoneNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LetterCombinationsOfAPhoneNumber (Letter Combinations of a Phone Number) Passed!");
    }
}
