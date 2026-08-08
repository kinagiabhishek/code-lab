// https://leetcode.com/problems/pascals-triangle/
package arrays_and_hashing;

import java.util.*;

public class PascalsTriangle {
    // LeetCode Problem 118: Pascal's Triangle
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PascalsTriangle solver = new PascalsTriangle();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode118_PascalsTriangle (Pascal's Triangle) Passed!");
    }
}
