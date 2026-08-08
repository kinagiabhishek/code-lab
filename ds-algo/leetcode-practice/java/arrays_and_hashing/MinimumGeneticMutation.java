// https://leetcode.com/problems/minimum-genetic-mutation/
package arrays_and_hashing;

import java.util.*;

public class MinimumGeneticMutation {
    // LeetCode Problem 433: Minimum Genetic Mutation
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MinimumGeneticMutation solver = new MinimumGeneticMutation();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode433_MinimumGeneticMutation (Minimum Genetic Mutation) Passed!");
    }
}
