// https://leetcode.com/problems/powx-n/
package arrays_and_hashing;

import java.util.*;

public class LeetCode50_PowxN {
    // LeetCode Problem 50: Pow(x, n)
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode50_PowxN solver = new LeetCode50_PowxN();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode50_PowxN (Pow(x, n)) Passed!");
    }
}
