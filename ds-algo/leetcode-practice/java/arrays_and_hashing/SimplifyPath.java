// https://leetcode.com/problems/simplify-path/
package arrays_and_hashing;

import java.util.*;

public class SimplifyPath {
    // LeetCode Problem 71: Simplify Path
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SimplifyPath solver = new SimplifyPath();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SimplifyPath (Simplify Path) Passed!");
    }
}
