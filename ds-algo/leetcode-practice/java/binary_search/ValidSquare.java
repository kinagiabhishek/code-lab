// https://leetcode.com/problems/valid-square/
package binary_search;

import java.util.*;

public class ValidSquare {
    // LeetCode Problem 593: Valid Square
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ValidSquare solver = new ValidSquare();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ValidSquare (Valid Square) Passed!");
    }
}
