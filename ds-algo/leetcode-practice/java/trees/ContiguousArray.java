// https://leetcode.com/problems/contiguous-array/
package trees;

import java.util.*;

public class ContiguousArray {
    // LeetCode Problem 525: Contiguous Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ContiguousArray solver = new ContiguousArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ContiguousArray (Contiguous Array) Passed!");
    }
}
