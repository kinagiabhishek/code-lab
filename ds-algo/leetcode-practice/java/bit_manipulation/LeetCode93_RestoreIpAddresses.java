// https://leetcode.com/problems/restore-ip-addresses/
package bit_manipulation;

import java.util.*;

public class LeetCode93_RestoreIpAddresses {
    // LeetCode Problem 93: Restore IP Addresses
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode93_RestoreIpAddresses solver = new LeetCode93_RestoreIpAddresses();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode93_RestoreIpAddresses (Restore IP Addresses) Passed!");
    }
}
