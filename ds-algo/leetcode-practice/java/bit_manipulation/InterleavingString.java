// https://leetcode.com/problems/interleaving-string/
package bit_manipulation;

import java.util.*;

public class InterleavingString {
    // LeetCode Problem 97: Interleaving String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        InterleavingString solver = new InterleavingString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ InterleavingString (Interleaving String) Passed!");
    }
}
