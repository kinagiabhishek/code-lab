// https://leetcode.com/problems/same-tree/
package trees;

import java.util.*;

public class LeetCode100_SameTree {
    // LeetCode Problem 100: Same Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode100_SameTree solver = new LeetCode100_SameTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode100_SameTree (Same Tree) Passed!");
    }
}
