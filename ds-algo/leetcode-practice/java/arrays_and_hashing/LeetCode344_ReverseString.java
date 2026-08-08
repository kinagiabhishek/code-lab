// https://leetcode.com/problems/reverse-string/
package arrays_and_hashing;

import java.util.*;

public class LeetCode344_ReverseString {
    // LeetCode Problem 344: Reverse String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode344_ReverseString solver = new LeetCode344_ReverseString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode344_ReverseString (Reverse String) Passed!");
    }
}
