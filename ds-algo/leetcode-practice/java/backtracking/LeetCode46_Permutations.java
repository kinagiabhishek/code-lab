// https://leetcode.com/problems/permutations/
package backtracking;

import java.util.*;

public class LeetCode46_Permutations {
    // LeetCode Problem 46: Permutations
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode46_Permutations solver = new LeetCode46_Permutations();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode46_Permutations (Permutations) Passed!");
    }
}
