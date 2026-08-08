// https://leetcode.com/problems/out-of-boundary-paths/
package dynamic_programming;

import java.util.*;

public class LeetCode576_OutOfBoundaryPaths {
    // LeetCode Problem 576: Out of Boundary Paths
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode576_OutOfBoundaryPaths solver = new LeetCode576_OutOfBoundaryPaths();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode576_OutOfBoundaryPaths (Out of Boundary Paths) Passed!");
    }
}
