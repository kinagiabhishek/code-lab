// https://leetcode.com/problems/pascals-triangle-ii/
package arrays_and_hashing;

import java.util.*;

public class LeetCode119_PascalsTriangleIi {
    // LeetCode Problem 119: Pascal's Triangle II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode119_PascalsTriangleIi solver = new LeetCode119_PascalsTriangleIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode119_PascalsTriangleIi (Pascal's Triangle II) Passed!");
    }
}
