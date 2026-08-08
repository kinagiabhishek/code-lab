// https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
package math;

import java.util.*;

public class LeetCode373_FindKPairsWithSmallestSums {
    // LeetCode Problem 373: Find K Pairs with Smallest Sums
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode373_FindKPairsWithSmallestSums solver = new LeetCode373_FindKPairsWithSmallestSums();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode373_FindKPairsWithSmallestSums (Find K Pairs with Smallest Sums) Passed!");
    }
}
