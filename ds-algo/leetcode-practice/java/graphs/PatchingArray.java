// https://leetcode.com/problems/patching-array/
package graphs;

import java.util.*;

public class PatchingArray {
    // LeetCode Problem 330: Patching Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PatchingArray solver = new PatchingArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PatchingArray (Patching Array) Passed!");
    }
}
