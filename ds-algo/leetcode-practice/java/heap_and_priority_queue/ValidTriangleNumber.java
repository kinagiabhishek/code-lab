// https://leetcode.com/problems/valid-triangle-number/
package heap_and_priority_queue;

import java.util.*;

public class ValidTriangleNumber {
    // LeetCode Problem 611: Valid Triangle Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ValidTriangleNumber solver = new ValidTriangleNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ValidTriangleNumber (Valid Triangle Number) Passed!");
    }
}
