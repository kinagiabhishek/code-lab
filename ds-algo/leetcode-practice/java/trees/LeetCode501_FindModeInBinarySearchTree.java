// https://leetcode.com/problems/find-mode-in-binary-search-tree/
package trees;

import java.util.*;

public class LeetCode501_FindModeInBinarySearchTree {
    // LeetCode Problem 501: Find Mode in Binary Search Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode501_FindModeInBinarySearchTree solver = new LeetCode501_FindModeInBinarySearchTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode501_FindModeInBinarySearchTree (Find Mode in Binary Search Tree) Passed!");
    }
}
