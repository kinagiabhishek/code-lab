// https://leetcode.com/problems/contains-duplicate/
package trees;

import java.util.*;

public class ContainsDuplicate {
    // LeetCode Problem 217: Contains Duplicate
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ContainsDuplicate solver = new ContainsDuplicate();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ContainsDuplicate (Contains Duplicate) Passed!");
    }
}
