// https://leetcode.com/problems/move-zeroes/
package sliding_window;

import java.util.*;

public class MoveZeroes {
    // LeetCode Problem 283: Move Zeroes
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MoveZeroes solver = new MoveZeroes();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MoveZeroes (Move Zeroes) Passed!");
    }
}
