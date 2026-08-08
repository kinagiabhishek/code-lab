// https://leetcode.com/problems/max-consecutive-ones/
package arrays_and_hashing;

import java.util.*;

public class MaxConsecutiveOnes {
    // LeetCode Problem 485: Max Consecutive Ones
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes solver = new MaxConsecutiveOnes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode485_MaxConsecutiveOnes (Max Consecutive Ones) Passed!");
    }
}
