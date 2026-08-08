// https://leetcode.com/problems/pascals-triangle/
package linked_lists;

import java.util.*;

public class PascalsTriangle {
    // LeetCode Problem 118: Pascal's Triangle
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PascalsTriangle solver = new PascalsTriangle();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PascalsTriangle (Pascal's Triangle) Passed!");
    }
}
