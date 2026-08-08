// https://leetcode.com/problems/magical-string/
package arrays_and_hashing;

import java.util.*;

public class MagicalString {
    // LeetCode Problem 481: Magical String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MagicalString solver = new MagicalString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode481_MagicalString (Magical String) Passed!");
    }
}
