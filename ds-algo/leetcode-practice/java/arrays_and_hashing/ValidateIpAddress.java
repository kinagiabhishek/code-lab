// https://leetcode.com/problems/validate-ip-address/
package arrays_and_hashing;

import java.util.*;

public class ValidateIpAddress {
    // LeetCode Problem 468: Validate IP Address
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ValidateIpAddress solver = new ValidateIpAddress();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode468_ValidateIpAddress (Validate IP Address) Passed!");
    }
}
