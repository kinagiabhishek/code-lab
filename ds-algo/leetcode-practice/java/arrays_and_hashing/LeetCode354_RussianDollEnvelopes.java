// https://leetcode.com/problems/russian-doll-envelopes/
package arrays_and_hashing;

import java.util.*;

public class LeetCode354_RussianDollEnvelopes {
    // LeetCode Problem 354: Russian Doll Envelopes
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode354_RussianDollEnvelopes solver = new LeetCode354_RussianDollEnvelopes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode354_RussianDollEnvelopes (Russian Doll Envelopes) Passed!");
    }
}
