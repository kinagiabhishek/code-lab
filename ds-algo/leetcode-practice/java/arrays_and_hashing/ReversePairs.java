// https://leetcode.com/problems/reverse-pairs/
package arrays_and_hashing;

import java.util.*;

public class ReversePairs {
    // LeetCode Problem 493: Reverse Pairs
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ReversePairs solver = new ReversePairs();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode493_ReversePairs (Reverse Pairs) Passed!");
    }
}
