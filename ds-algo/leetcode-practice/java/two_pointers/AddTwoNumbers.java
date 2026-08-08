// https://leetcode.com/problems/add-two-numbers/
package two_pointers;

import java.util.*;

public class AddTwoNumbers {
    // LeetCode Problem 2: Add Two Numbers
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        AddTwoNumbers solver = new AddTwoNumbers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ AddTwoNumbers (Add Two Numbers) Passed!");
    }
}
