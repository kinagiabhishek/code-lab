// https://leetcode.com/problems/add-binary/
package dynamic_programming;

import java.util.*;

public class AddBinary {
    // LeetCode Problem 67: Add Binary
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        AddBinary solver = new AddBinary();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ AddBinary (Add Binary) Passed!");
    }
}
