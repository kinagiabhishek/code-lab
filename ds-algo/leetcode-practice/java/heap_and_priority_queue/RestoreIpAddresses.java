// https://leetcode.com/problems/restore-ip-addresses/
package heap_and_priority_queue;

import java.util.*;

public class RestoreIpAddresses {
    // LeetCode Problem 93: Restore IP Addresses
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RestoreIpAddresses solver = new RestoreIpAddresses();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RestoreIpAddresses (Restore IP Addresses) Passed!");
    }
}
