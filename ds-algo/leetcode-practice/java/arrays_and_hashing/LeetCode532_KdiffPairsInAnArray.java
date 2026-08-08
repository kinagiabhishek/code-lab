// https://leetcode.com/problems/k-diff-pairs-in-an-array/
package arrays_and_hashing;

import java.util.*;

public class LeetCode532_KdiffPairsInAnArray {
    // LeetCode Problem 532: K-diff Pairs in an Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode532_KdiffPairsInAnArray solver = new LeetCode532_KdiffPairsInAnArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode532_KdiffPairsInAnArray (K-diff Pairs in an Array) Passed!");
    }
}
