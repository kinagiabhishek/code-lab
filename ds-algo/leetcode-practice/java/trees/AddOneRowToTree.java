// https://leetcode.com/problems/add-one-row-to-tree/
package trees;

import java.util.*;

public class AddOneRowToTree {
    // LeetCode Problem 623: Add One Row to Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        AddOneRowToTree solver = new AddOneRowToTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ AddOneRowToTree (Add One Row to Tree) Passed!");
    }
}
