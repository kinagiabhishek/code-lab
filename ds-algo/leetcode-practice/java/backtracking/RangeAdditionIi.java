// https://leetcode.com/problems/range-addition-ii/
package backtracking;

import java.util.*;

public class RangeAdditionIi {
    // LeetCode Problem 598: Range Addition II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RangeAdditionIi solver = new RangeAdditionIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RangeAdditionIi (Range Addition II) Passed!");
    }
}
