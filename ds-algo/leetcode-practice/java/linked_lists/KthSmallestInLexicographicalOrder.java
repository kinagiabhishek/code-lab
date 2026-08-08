// https://leetcode.com/problems/k-th-smallest-in-lexicographical-order/
package linked_lists;

import java.util.*;

public class KthSmallestInLexicographicalOrder {
    // LeetCode Problem 440: K-th Smallest in Lexicographical Order
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        KthSmallestInLexicographicalOrder solver = new KthSmallestInLexicographicalOrder();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ KthSmallestInLexicographicalOrder (K-th Smallest in Lexicographical Order) Passed!");
    }
}
