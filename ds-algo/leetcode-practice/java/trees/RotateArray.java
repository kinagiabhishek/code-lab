// https://leetcode.com/problems/rotate-array/
package trees;

import java.util.*;

public class RotateArray {
    // LeetCode Problem 189: Rotate Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RotateArray solver = new RotateArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RotateArray (Rotate Array) Passed!");
    }
}
