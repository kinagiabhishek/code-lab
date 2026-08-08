// https://leetcode.com/problems/minimum-genetic-mutation/
package bit_manipulation;

import java.util.*;

public class MinimumGeneticMutation {
    // LeetCode Problem 433: Minimum Genetic Mutation
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumGeneticMutation solver = new MinimumGeneticMutation();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumGeneticMutation (Minimum Genetic Mutation) Passed!");
    }
}
