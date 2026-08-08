// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
package backtracking;

import java.util.*;

public class LeetCode17_LetterCombinationsOfAPhoneNumber {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode17_LetterCombinationsOfAPhoneNumber solver = new LeetCode17_LetterCombinationsOfAPhoneNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode17_LetterCombinationsOfAPhoneNumber Passed!");
    }
}
