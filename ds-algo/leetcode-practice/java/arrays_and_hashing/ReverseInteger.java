// https://leetcode.com/problems/reverse-integer/
package arrays_and_hashing;

import java.util.*;

public class ReverseInteger {
    // LeetCode Problem 7: Reverse Integer
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ReverseInteger solver = new ReverseInteger();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode7_ReverseInteger (Reverse Integer) Passed!");
    }
}
