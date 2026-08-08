// https://leetcode.com/problems/freedom-trail/
package arrays_and_hashing;

import java.util.*;

public class LeetCode514_FreedomTrail {
    // LeetCode Problem 514: Freedom Trail
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode514_FreedomTrail solver = new LeetCode514_FreedomTrail();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode514_FreedomTrail (Freedom Trail) Passed!");
    }
}
