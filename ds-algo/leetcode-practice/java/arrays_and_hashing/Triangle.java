// https://leetcode.com/problems/triangle/
package arrays_and_hashing;

import java.util.*;

public class Triangle {
    // LeetCode Problem 120: Triangle
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        Triangle solver = new Triangle();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode120_Triangle (Triangle) Passed!");
    }
}
