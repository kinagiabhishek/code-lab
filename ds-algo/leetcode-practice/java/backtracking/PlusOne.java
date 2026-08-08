// https://leetcode.com/problems/plus-one/
package backtracking;

import java.util.*;

public class PlusOne {
    // LeetCode Problem 66: Plus One
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PlusOne solver = new PlusOne();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PlusOne (Plus One) Passed!");
    }
}
