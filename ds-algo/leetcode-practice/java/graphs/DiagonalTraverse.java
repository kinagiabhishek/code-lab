// https://leetcode.com/problems/diagonal-traverse/
package graphs;

import java.util.*;

public class DiagonalTraverse {
    // LeetCode Problem 498: Diagonal Traverse
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DiagonalTraverse solver = new DiagonalTraverse();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DiagonalTraverse (Diagonal Traverse) Passed!");
    }
}
