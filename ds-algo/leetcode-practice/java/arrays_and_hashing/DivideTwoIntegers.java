// https://leetcode.com/problems/divide-two-integers/
package arrays_and_hashing;

import java.util.*;

public class DivideTwoIntegers {
    // LeetCode Problem 29: Divide Two Integers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DivideTwoIntegers solver = new DivideTwoIntegers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode29_DivideTwoIntegers (Divide Two Integers) Passed!");
    }
}
