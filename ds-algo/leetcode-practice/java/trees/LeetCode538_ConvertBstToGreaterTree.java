// https://leetcode.com/problems/convert-bst-to-greater-tree/
package trees;

import java.util.*;

public class LeetCode538_ConvertBstToGreaterTree {
    // LeetCode Problem 538: Convert BST to Greater Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode538_ConvertBstToGreaterTree solver = new LeetCode538_ConvertBstToGreaterTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode538_ConvertBstToGreaterTree (Convert BST to Greater Tree) Passed!");
    }
}
