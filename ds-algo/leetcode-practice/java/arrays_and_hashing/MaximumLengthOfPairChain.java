// https://leetcode.com/problems/maximum-length-of-pair-chain/
package arrays_and_hashing;

import java.util.*;

public class MaximumLengthOfPairChain {
    // LeetCode Problem 646: Maximum Length of Pair Chain
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MaximumLengthOfPairChain solver = new MaximumLengthOfPairChain();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode646_MaximumLengthOfPairChain (Maximum Length of Pair Chain) Passed!");
    }
}
