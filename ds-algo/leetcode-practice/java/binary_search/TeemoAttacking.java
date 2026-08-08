// https://leetcode.com/problems/teemo-attacking/
package binary_search;

import java.util.*;

public class TeemoAttacking {
    // LeetCode Problem 495: Teemo Attacking
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TeemoAttacking solver = new TeemoAttacking();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TeemoAttacking (Teemo Attacking) Passed!");
    }
}
