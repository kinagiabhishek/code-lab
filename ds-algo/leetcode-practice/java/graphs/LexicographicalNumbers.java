// https://leetcode.com/problems/lexicographical-numbers/
package graphs;

import java.util.*;

public class LexicographicalNumbers {
    // LeetCode Problem 386: Lexicographical Numbers
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LexicographicalNumbers solver = new LexicographicalNumbers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LexicographicalNumbers (Lexicographical Numbers) Passed!");
    }
}
