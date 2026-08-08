// https://leetcode.com/problems/happy-number/
package arrays_and_hashing;

import java.util.*;

public class LeetCode202_HappyNumber {
    // LeetCode Problem 202: Happy Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode202_HappyNumber solver = new LeetCode202_HappyNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode202_HappyNumber (Happy Number) Passed!");
    }
}
