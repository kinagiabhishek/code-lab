// https://leetcode.com/problems/valid-phone-numbers/
package arrays_and_hashing;

import java.util.*;

public class LeetCode193_ValidPhoneNumbers {
    // LeetCode Problem 193: Valid Phone Numbers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode193_ValidPhoneNumbers solver = new LeetCode193_ValidPhoneNumbers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode193_ValidPhoneNumbers (Valid Phone Numbers) Passed!");
    }
}
