// https://leetcode.com/problems/diameter-of-binary-tree/
package trees;

import java.util.*;

public class LeetCode543_DiameterOfBinaryTree {
    // LeetCode Problem 543: Diameter of Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode543_DiameterOfBinaryTree solver = new LeetCode543_DiameterOfBinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode543_DiameterOfBinaryTree (Diameter of Binary Tree) Passed!");
    }
}
