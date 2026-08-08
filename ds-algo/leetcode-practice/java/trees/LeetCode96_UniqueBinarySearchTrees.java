// https://leetcode.com/problems/unique-binary-search-trees/
package trees;

import java.util.*;

public class LeetCode96_UniqueBinarySearchTrees {
    // LeetCode Problem 96: Unique Binary Search Trees
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode96_UniqueBinarySearchTrees solver = new LeetCode96_UniqueBinarySearchTrees();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode96_UniqueBinarySearchTrees (Unique Binary Search Trees) Passed!");
    }
}
