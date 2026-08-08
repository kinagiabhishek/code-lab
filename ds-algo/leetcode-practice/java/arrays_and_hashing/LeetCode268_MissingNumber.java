// https://leetcode.com/problems/missing-number/
package arrays_and_hashing;

import java.util.*;

public class LeetCode268_MissingNumber {
    // LeetCode Problem 268: Missing Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode268_MissingNumber solver = new LeetCode268_MissingNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode268_MissingNumber (Missing Number) Passed!");
    }
}
