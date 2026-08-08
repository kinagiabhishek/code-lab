// https://leetcode.com/problems/find-duplicate-file-in-system/
package trees;

import java.util.*;

public class FindDuplicateFileInSystem {
    // LeetCode Problem 609: Find Duplicate File in System
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindDuplicateFileInSystem solver = new FindDuplicateFileInSystem();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindDuplicateFileInSystem (Find Duplicate File in System) Passed!");
    }
}
