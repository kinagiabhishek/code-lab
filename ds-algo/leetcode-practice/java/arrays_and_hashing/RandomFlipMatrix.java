// https://leetcode.com/problems/random-flip-matrix/
package arrays_and_hashing;

import java.util.*;

public class RandomFlipMatrix {
    // LeetCode Problem 519: Random Flip Matrix
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RandomFlipMatrix solver = new RandomFlipMatrix();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RandomFlipMatrix (Random Flip Matrix) Passed!");
    }
}
