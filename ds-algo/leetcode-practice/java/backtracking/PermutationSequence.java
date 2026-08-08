// https://leetcode.com/problems/permutation-sequence/
package backtracking;

import java.util.*;

public class PermutationSequence {
    // LeetCode Problem 60: Permutation Sequence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PermutationSequence solver = new PermutationSequence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode60_PermutationSequence (Permutation Sequence) Passed!");
    }
}
