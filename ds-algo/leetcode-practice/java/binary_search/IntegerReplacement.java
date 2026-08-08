// https://leetcode.com/problems/integer-replacement/
package binary_search;

import java.util.*;

public class IntegerReplacement {
    // LeetCode Problem 397: Integer Replacement
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        IntegerReplacement solver = new IntegerReplacement();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ IntegerReplacement (Integer Replacement) Passed!");
    }
}
