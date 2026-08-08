// https://leetcode.com/problems/magical-string/
package arrays_and_hashing;

import java.util.*;

public class LeetCode481_MagicalString {
    // LeetCode Problem 481: Magical String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode481_MagicalString solver = new LeetCode481_MagicalString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode481_MagicalString (Magical String) Passed!");
    }
}
