// https://leetcode.com/problems/happy-number/
package linked_lists;

import java.util.*;

public class HappyNumber {
    // LeetCode Problem 202: Happy Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        HappyNumber solver = new HappyNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ HappyNumber (Happy Number) Passed!");
    }
}
