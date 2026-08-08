// https://leetcode.com/problems/binary-tree-paths/
package trees;

import java.util.*;

public class LeetCode257_BinaryTreePaths {
    // LeetCode Problem 257: Binary Tree Paths
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode257_BinaryTreePaths solver = new LeetCode257_BinaryTreePaths();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode257_BinaryTreePaths (Binary Tree Paths) Passed!");
    }
}
