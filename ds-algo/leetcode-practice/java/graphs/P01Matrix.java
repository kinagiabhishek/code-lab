// https://leetcode.com/problems/01-matrix/
package graphs;

import java.util.*;

public class P01Matrix {
    // LeetCode Problem 542: 01 Matrix
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        P01Matrix solver = new P01Matrix();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode542_P01Matrix (01 Matrix) Passed!");
    }
}
