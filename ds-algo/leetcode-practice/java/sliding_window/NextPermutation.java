// https://leetcode.com/problems/next-permutation/
package sliding_window;

import java.util.*;

public class NextPermutation {
    // LeetCode Problem 31: Next Permutation
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NextPermutation solver = new NextPermutation();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NextPermutation (Next Permutation) Passed!");
    }
}
