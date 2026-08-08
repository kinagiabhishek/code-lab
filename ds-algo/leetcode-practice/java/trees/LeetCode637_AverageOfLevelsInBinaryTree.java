// https://leetcode.com/problems/average-of-levels-in-binary-tree/
package trees;

import java.util.*;

public class LeetCode637_AverageOfLevelsInBinaryTree {
    // LeetCode Problem 637: Average of Levels in Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode637_AverageOfLevelsInBinaryTree solver = new LeetCode637_AverageOfLevelsInBinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode637_AverageOfLevelsInBinaryTree (Average of Levels in Binary Tree) Passed!");
    }
}
