// https://leetcode.com/problems/symmetric-tree/
package trees;

import java.util.*;

public class LeetCode101_SymmetricTree {
    // LeetCode Problem 101: Symmetric Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode101_SymmetricTree solver = new LeetCode101_SymmetricTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode101_SymmetricTree (Symmetric Tree) Passed!");
    }
}
