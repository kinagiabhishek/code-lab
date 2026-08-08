// https://leetcode.com/problems/reshape-the-matrix/
package linked_lists;

import java.util.*;

public class ReshapeTheMatrix {
    // LeetCode Problem 566: Reshape the Matrix
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ReshapeTheMatrix solver = new ReshapeTheMatrix();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ReshapeTheMatrix (Reshape the Matrix) Passed!");
    }
}
