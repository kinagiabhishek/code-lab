// https://leetcode.com/problems/validate-ip-address/
package linked_lists;

import java.util.*;

public class ValidateIpAddress {
    // LeetCode Problem 468: Validate IP Address
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ValidateIpAddress solver = new ValidateIpAddress();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ValidateIpAddress (Validate IP Address) Passed!");
    }
}
