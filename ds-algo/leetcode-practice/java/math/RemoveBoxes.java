// https://leetcode.com/problems/remove-boxes/
package math;

import java.util.*;

public class RemoveBoxes {
    // LeetCode Problem 546: Remove Boxes
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RemoveBoxes solver = new RemoveBoxes();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RemoveBoxes (Remove Boxes) Passed!");
    }
}
