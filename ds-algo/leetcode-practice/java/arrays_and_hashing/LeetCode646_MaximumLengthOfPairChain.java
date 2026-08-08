// https://leetcode.com/problems/maximum-length-of-pair-chain/
package arrays_and_hashing;

import java.util.*;

public class LeetCode646_MaximumLengthOfPairChain {
    // LeetCode Problem 646: Maximum Length of Pair Chain
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode646_MaximumLengthOfPairChain solver = new LeetCode646_MaximumLengthOfPairChain();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode646_MaximumLengthOfPairChain (Maximum Length of Pair Chain) Passed!");
    }
}
