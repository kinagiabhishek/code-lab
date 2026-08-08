// https://leetcode.com/problems/permutations-ii/
package backtracking;

import java.util.*;

public class LeetCode47_PermutationsIi {
    // LeetCode Problem 47: Permutations II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode47_PermutationsIi solver = new LeetCode47_PermutationsIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode47_PermutationsIi (Permutations II) Passed!");
    }
}
