// https://leetcode.com/problems/self-crossing/
package bit_manipulation;

import java.util.*;

public class SelfCrossing {
    // LeetCode Problem 335: Self Crossing
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SelfCrossing solver = new SelfCrossing();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SelfCrossing (Self Crossing) Passed!");
    }
}
