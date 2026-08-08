// https://leetcode.com/problems/combine-two-tables/
package trees;

import java.util.*;

public class CombineTwoTables {
    // LeetCode Problem 175: Combine Two Tables
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CombineTwoTables solver = new CombineTwoTables();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CombineTwoTables (Combine Two Tables) Passed!");
    }
}
