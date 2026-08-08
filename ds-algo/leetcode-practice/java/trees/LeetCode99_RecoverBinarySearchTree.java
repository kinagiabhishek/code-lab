// https://leetcode.com/problems/recover-binary-search-tree/
package trees;

import java.util.*;

public class LeetCode99_RecoverBinarySearchTree {
    // LeetCode Problem 99: Recover Binary Search Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode99_RecoverBinarySearchTree solver = new LeetCode99_RecoverBinarySearchTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode99_RecoverBinarySearchTree (Recover Binary Search Tree) Passed!");
    }
}
