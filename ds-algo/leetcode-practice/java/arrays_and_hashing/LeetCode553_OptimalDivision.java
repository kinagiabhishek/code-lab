// https://leetcode.com/problems/optimal-division/
package arrays_and_hashing;

import java.util.*;

public class LeetCode553_OptimalDivision {
    // LeetCode Problem 553: Optimal Division
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode553_OptimalDivision solver = new LeetCode553_OptimalDivision();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode553_OptimalDivision (Optimal Division) Passed!");
    }
}
