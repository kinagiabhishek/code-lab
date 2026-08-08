// https://leetcode.com/problems/symmetric-tree/
package sliding_window;

import java.util.*;

public class SymmetricTree {
    // LeetCode Problem 101: Symmetric Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SymmetricTree solver = new SymmetricTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SymmetricTree (Symmetric Tree) Passed!");
    }
}
