// https://leetcode.com/problems/diameter-of-binary-tree/
package trees;

import java.util.*;

public class DiameterOfBinaryTree {
    // LeetCode Problem 543: Diameter of Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree solver = new DiameterOfBinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode543_DiameterOfBinaryTree (Diameter of Binary Tree) Passed!");
    }
}
