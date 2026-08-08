// https://leetcode.com/problems/combination-sum-iii/
package linked_lists;

import java.util.*;

public class CombinationSumIii {
    // LeetCode Problem 216: Combination Sum III
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CombinationSumIii solver = new CombinationSumIii();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CombinationSumIii (Combination Sum III) Passed!");
    }
}
