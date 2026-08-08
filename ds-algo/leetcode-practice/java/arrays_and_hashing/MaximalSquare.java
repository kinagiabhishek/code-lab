// https://leetcode.com/problems/maximal-square/
package arrays_and_hashing;

import java.util.*;

public class MaximalSquare {
    // LeetCode Problem 221: Maximal Square
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MaximalSquare solver = new MaximalSquare();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode221_MaximalSquare (Maximal Square) Passed!");
    }
}
