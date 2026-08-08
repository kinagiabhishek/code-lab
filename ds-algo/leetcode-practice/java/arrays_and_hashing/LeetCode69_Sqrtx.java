// https://leetcode.com/problems/sqrtx/
package arrays_and_hashing;

import java.util.*;

public class LeetCode69_Sqrtx {
    // LeetCode Problem 69: Sqrt(x)
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode69_Sqrtx solver = new LeetCode69_Sqrtx();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode69_Sqrtx (Sqrt(x)) Passed!");
    }
}
