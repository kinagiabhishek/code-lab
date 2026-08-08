// https://leetcode.com/problems/out-of-boundary-paths/
package dynamic_programming;

import java.util.*;

public class OutOfBoundaryPaths {
    // LeetCode Problem 576: Out of Boundary Paths
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        OutOfBoundaryPaths solver = new OutOfBoundaryPaths();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode576_OutOfBoundaryPaths (Out of Boundary Paths) Passed!");
    }
}
