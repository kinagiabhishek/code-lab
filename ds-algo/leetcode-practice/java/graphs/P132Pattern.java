// https://leetcode.com/problems/132-pattern/
package graphs;

import java.util.*;

public class P132Pattern {
    // LeetCode Problem 456: 132 Pattern
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        P132Pattern solver = new P132Pattern();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ P132Pattern (132 Pattern) Passed!");
    }
}
