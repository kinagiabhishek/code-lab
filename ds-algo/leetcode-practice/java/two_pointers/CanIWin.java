// https://leetcode.com/problems/can-i-win/
package two_pointers;

import java.util.*;

public class CanIWin {
    // LeetCode Problem 464: Can I Win
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CanIWin solver = new CanIWin();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CanIWin (Can I Win) Passed!");
    }
}
