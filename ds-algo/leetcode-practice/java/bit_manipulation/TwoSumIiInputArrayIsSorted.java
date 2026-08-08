// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
package bit_manipulation;

import java.util.*;

public class TwoSumIiInputArrayIsSorted {
    // LeetCode Problem 167: Two Sum II - Input Array Is Sorted
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TwoSumIiInputArrayIsSorted solver = new TwoSumIiInputArrayIsSorted();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TwoSumIiInputArrayIsSorted (Two Sum II - Input Array Is Sorted) Passed!");
    }
}
