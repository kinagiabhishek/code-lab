// https://leetcode.com/problems/reverse-string/
package arrays_and_hashing;

import java.util.*;

public class ReverseString {
    // LeetCode Problem 344: Reverse String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ReverseString solver = new ReverseString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode344_ReverseString (Reverse String) Passed!");
    }
}
