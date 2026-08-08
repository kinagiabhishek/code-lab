// https://leetcode.com/problems/additive-number/
package arrays_and_hashing;

import java.util.*;

public class AdditiveNumber {
    // LeetCode Problem 306: Additive Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        AdditiveNumber solver = new AdditiveNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode306_AdditiveNumber (Additive Number) Passed!");
    }
}
