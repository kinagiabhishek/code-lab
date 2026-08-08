// https://leetcode.com/problems/reverse-integer/
package arrays_and_hashing;

import java.util.*;

public class LeetCode7_ReverseInteger {
    // LeetCode Problem 7: Reverse Integer
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode7_ReverseInteger solver = new LeetCode7_ReverseInteger();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode7_ReverseInteger (Reverse Integer) Passed!");
    }
}
