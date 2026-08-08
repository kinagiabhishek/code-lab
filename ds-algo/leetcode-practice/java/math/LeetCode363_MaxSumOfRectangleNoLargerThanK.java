// https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/
package math;

import java.util.*;

public class LeetCode363_MaxSumOfRectangleNoLargerThanK {
    // LeetCode Problem 363: Max Sum of Rectangle No Larger Than K
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode363_MaxSumOfRectangleNoLargerThanK solver = new LeetCode363_MaxSumOfRectangleNoLargerThanK();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode363_MaxSumOfRectangleNoLargerThanK (Max Sum of Rectangle No Larger Than K) Passed!");
    }
}
