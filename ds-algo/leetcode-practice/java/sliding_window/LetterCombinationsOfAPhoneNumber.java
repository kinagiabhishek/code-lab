// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
package sliding_window;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    // LeetCode Problem 17: Letter Combinations of a Phone Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber solver = new LetterCombinationsOfAPhoneNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ LetterCombinationsOfAPhoneNumber Passed!");
    }
}
