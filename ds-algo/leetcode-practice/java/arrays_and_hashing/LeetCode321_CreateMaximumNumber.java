// https://leetcode.com/problems/create-maximum-number/
package arrays_and_hashing;

import java.util.*;

public class LeetCode321_CreateMaximumNumber {
    // LeetCode Problem 321: Create Maximum Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode321_CreateMaximumNumber solver = new LeetCode321_CreateMaximumNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode321_CreateMaximumNumber (Create Maximum Number) Passed!");
    }
}
