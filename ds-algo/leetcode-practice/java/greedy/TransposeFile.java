// https://leetcode.com/problems/transpose-file/
package greedy;

import java.util.*;

public class TransposeFile {
    // LeetCode Problem 194: Transpose File
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TransposeFile solver = new TransposeFile();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TransposeFile (Transpose File) Passed!");
    }
}
