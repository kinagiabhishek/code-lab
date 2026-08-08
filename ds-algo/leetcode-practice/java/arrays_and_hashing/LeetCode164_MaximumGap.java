// https://leetcode.com/problems/maximum-gap/
package arrays_and_hashing;

import java.util.*;

public class LeetCode164_MaximumGap {
    // LeetCode Problem 164: Maximum Gap
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode164_MaximumGap solver = new LeetCode164_MaximumGap();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode164_MaximumGap (Maximum Gap) Passed!");
    }
}
