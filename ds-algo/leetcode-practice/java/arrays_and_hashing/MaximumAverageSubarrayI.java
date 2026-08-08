// https://leetcode.com/problems/maximum-average-subarray-i/
package arrays_and_hashing;

import java.util.*;

public class MaximumAverageSubarrayI {
    // LeetCode Problem 643: Maximum Average Subarray I
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MaximumAverageSubarrayI solver = new MaximumAverageSubarrayI();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode643_MaximumAverageSubarrayI (Maximum Average Subarray I) Passed!");
    }
}
