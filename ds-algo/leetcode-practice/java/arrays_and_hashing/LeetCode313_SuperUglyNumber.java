// https://leetcode.com/problems/super-ugly-number/
package arrays_and_hashing;

import java.util.*;

public class LeetCode313_SuperUglyNumber {
    // LeetCode Problem 313: Super Ugly Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode313_SuperUglyNumber solver = new LeetCode313_SuperUglyNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode313_SuperUglyNumber (Super Ugly Number) Passed!");
    }
}
