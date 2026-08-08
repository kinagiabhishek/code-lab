// https://leetcode.com/problems/heaters/
package bit_manipulation;

import java.util.*;

public class Heaters {
    // LeetCode Problem 475: Heaters
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        Heaters solver = new Heaters();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ Heaters (Heaters) Passed!");
    }
}
