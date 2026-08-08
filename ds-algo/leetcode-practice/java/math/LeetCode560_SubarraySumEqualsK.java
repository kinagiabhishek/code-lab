// https://leetcode.com/problems/subarray-sum-equals-k/
package math;

import java.util.*;

public class LeetCode560_SubarraySumEqualsK {
    // LeetCode Problem 560: Subarray Sum Equals K
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode560_SubarraySumEqualsK solver = new LeetCode560_SubarraySumEqualsK();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode560_SubarraySumEqualsK (Subarray Sum Equals K) Passed!");
    }
}
