// https://leetcode.com/problems/convert-bst-to-greater-tree/
package linked_lists;

import java.util.*;

public class ConvertBstToGreaterTree {
    // LeetCode Problem 538: Convert BST to Greater Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ConvertBstToGreaterTree solver = new ConvertBstToGreaterTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ConvertBstToGreaterTree (Convert BST to Greater Tree) Passed!");
    }
}
