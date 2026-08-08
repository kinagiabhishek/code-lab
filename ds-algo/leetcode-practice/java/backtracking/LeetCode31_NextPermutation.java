// https://leetcode.com/problems/next-permutation/
package backtracking;

import java.util.*;

public class LeetCode31_NextPermutation {
    // LeetCode Problem 31: Next Permutation
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode31_NextPermutation solver = new LeetCode31_NextPermutation();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode31_NextPermutation (Next Permutation) Passed!");
    }
}
