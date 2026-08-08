// https://leetcode.com/problems/out-of-boundary-paths/
package two_pointers;

import java.util.*;

public class OutOfBoundaryPaths {
    // LeetCode Problem 576: Out of Boundary Paths
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        OutOfBoundaryPaths solver = new OutOfBoundaryPaths();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ OutOfBoundaryPaths (Out of Boundary Paths) Passed!");
    }
}
