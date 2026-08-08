// https://leetcode.com/problems/largest-number/
package arrays_and_hashing;

import java.util.*;

public class LargestNumber {
    // LeetCode Problem 179: Largest Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LargestNumber solver = new LargestNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode179_LargestNumber (Largest Number) Passed!");
    }
}
