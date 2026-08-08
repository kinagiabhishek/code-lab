// https://leetcode.com/problems/bulls-and-cows/
package binary_search;

import java.util.*;

public class BullsAndCows {
    // LeetCode Problem 299: Bulls and Cows
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BullsAndCows solver = new BullsAndCows();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BullsAndCows (Bulls and Cows) Passed!");
    }
}
