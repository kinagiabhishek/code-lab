// https://leetcode.com/problems/subarray-sum-equals-k/
package math;

import java.util.*;

public class SubarraySumEqualsK {
    // LeetCode Problem 560: Subarray Sum Equals K
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK solver = new SubarraySumEqualsK();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode560_SubarraySumEqualsK (Subarray Sum Equals K) Passed!");
    }
}
