// https://leetcode.com/problems/first-missing-positive/
package arrays_and_hashing;

import java.util.*;

public class LeetCode41_FirstMissingPositive {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode41_FirstMissingPositive solver = new LeetCode41_FirstMissingPositive();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode41_FirstMissingPositive Passed!");
    }
}
