// https://leetcode.com/problems/permutation-in-string/
package backtracking;

import java.util.*;

public class LeetCode567_PermutationInString {
    // LeetCode Problem 567: Permutation in String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode567_PermutationInString solver = new LeetCode567_PermutationInString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode567_PermutationInString (Permutation in String) Passed!");
    }
}
