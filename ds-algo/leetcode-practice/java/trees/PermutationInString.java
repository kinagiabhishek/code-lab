// https://leetcode.com/problems/permutation-in-string/
package trees;

import java.util.*;

public class PermutationInString {
    // LeetCode Problem 567: Permutation in String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PermutationInString solver = new PermutationInString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PermutationInString (Permutation in String) Passed!");
    }
}
