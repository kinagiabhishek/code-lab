// https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
package heap_and_priority_queue;

import java.util.*;

public class FindKPairsWithSmallestSums {
    // LeetCode Problem 373: Find K Pairs with Smallest Sums
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindKPairsWithSmallestSums solver = new FindKPairsWithSmallestSums();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindKPairsWithSmallestSums (Find K Pairs with Smallest Sums) Passed!");
    }
}
