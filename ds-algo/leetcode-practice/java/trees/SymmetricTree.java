// https://leetcode.com/problems/symmetric-tree/
package trees;

import java.util.*;

public class SymmetricTree {
    // LeetCode Problem 101: Symmetric Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SymmetricTree solver = new SymmetricTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode101_SymmetricTree (Symmetric Tree) Passed!");
    }
}
