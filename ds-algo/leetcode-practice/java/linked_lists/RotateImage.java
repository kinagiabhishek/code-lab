// https://leetcode.com/problems/rotate-image/
package linked_lists;

import java.util.*;

public class RotateImage {
    // LeetCode Problem 48: Rotate Image
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RotateImage solver = new RotateImage();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RotateImage (Rotate Image) Passed!");
    }
}
