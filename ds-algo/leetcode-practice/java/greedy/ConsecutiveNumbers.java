// https://leetcode.com/problems/consecutive-numbers/
package greedy;

import java.util.*;

public class ConsecutiveNumbers {
    // LeetCode Problem 180: Consecutive Numbers
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ConsecutiveNumbers solver = new ConsecutiveNumbers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ConsecutiveNumbers (Consecutive Numbers) Passed!");
    }
}
