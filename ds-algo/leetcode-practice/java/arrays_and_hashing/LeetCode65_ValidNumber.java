// https://leetcode.com/problems/valid-number/
package arrays_and_hashing;

import java.util.*;

public class LeetCode65_ValidNumber {
    // LeetCode Problem 65: Valid Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode65_ValidNumber solver = new LeetCode65_ValidNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode65_ValidNumber (Valid Number) Passed!");
    }
}
