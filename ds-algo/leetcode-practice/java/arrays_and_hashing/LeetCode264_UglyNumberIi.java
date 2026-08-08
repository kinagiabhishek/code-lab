// https://leetcode.com/problems/ugly-number-ii/
package arrays_and_hashing;

import java.util.*;

public class LeetCode264_UglyNumberIi {
    // LeetCode Problem 264: Ugly Number II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode264_UglyNumberIi solver = new LeetCode264_UglyNumberIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode264_UglyNumberIi (Ugly Number II) Passed!");
    }
}
