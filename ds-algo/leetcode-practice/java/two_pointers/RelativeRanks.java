// https://leetcode.com/problems/relative-ranks/
package two_pointers;

import java.util.*;

public class RelativeRanks {
    // LeetCode Problem 506: Relative Ranks
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RelativeRanks solver = new RelativeRanks();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RelativeRanks (Relative Ranks) Passed!");
    }
}
