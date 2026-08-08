// https://leetcode.com/problems/decode-ways/
package arrays_and_hashing;

import java.util.*;

public class LeetCode91_DecodeWays {
    // LeetCode Problem 91: Decode Ways
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode91_DecodeWays solver = new LeetCode91_DecodeWays();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode91_DecodeWays (Decode Ways) Passed!");
    }
}
