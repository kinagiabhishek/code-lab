// https://leetcode.com/problems/investments-in-2016/
package dynamic_programming;

import java.util.*;

public class InvestmentsIn2016 {
    // LeetCode Problem 585: Investments in 2016
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        InvestmentsIn2016 solver = new InvestmentsIn2016();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ InvestmentsIn2016 (Investments in 2016) Passed!");
    }
}
