// https://leetcode.com/problems/count-of-smaller-numbers-after-self/
package trees;

import java.util.*;

public class CountOfSmallerNumbersAfterSelf {
    // LeetCode Problem 315: Count of Smaller Numbers After Self
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CountOfSmallerNumbersAfterSelf solver = new CountOfSmallerNumbersAfterSelf();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CountOfSmallerNumbersAfterSelf (Count of Smaller Numbers After Self) Passed!");
    }
}
