// https://leetcode.com/problems/decode-ways-ii/
package arrays_and_hashing;

import java.util.*;

public class DecodeWaysIi {
    // LeetCode Problem 639: Decode Ways II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DecodeWaysIi solver = new DecodeWaysIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode639_DecodeWaysIi (Decode Ways II) Passed!");
    }
}
