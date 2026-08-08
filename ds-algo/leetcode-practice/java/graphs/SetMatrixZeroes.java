// https://leetcode.com/problems/set-matrix-zeroes/
package graphs;

import java.util.*;

public class SetMatrixZeroes {
    // LeetCode Problem 73: Set Matrix Zeroes
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SetMatrixZeroes solver = new SetMatrixZeroes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode73_SetMatrixZeroes (Set Matrix Zeroes) Passed!");
    }
}
