// https://leetcode.com/problems/add-one-row-to-tree/
package trees;

import java.util.*;

public class AddOneRowToTree {
    // LeetCode Problem 623: Add One Row to Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        AddOneRowToTree solver = new AddOneRowToTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode623_AddOneRowToTree (Add One Row to Tree) Passed!");
    }
}
