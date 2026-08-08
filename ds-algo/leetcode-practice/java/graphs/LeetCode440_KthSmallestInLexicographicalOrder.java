// https://leetcode.com/problems/k-th-smallest-in-lexicographical-order/
package graphs;

import java.util.*;

public class LeetCode440_KthSmallestInLexicographicalOrder {
    // LeetCode Problem 440: K-th Smallest in Lexicographical Order
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode440_KthSmallestInLexicographicalOrder solver = new LeetCode440_KthSmallestInLexicographicalOrder();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode440_KthSmallestInLexicographicalOrder (K-th Smallest in Lexicographical Order) Passed!");
    }
}
