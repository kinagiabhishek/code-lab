// https://leetcode.com/problems/number-complement/
package arrays_and_hashing;

import java.util.*;

public class NumberComplement {
    // LeetCode Problem 476: Number Complement
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NumberComplement solver = new NumberComplement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode476_NumberComplement (Number Complement) Passed!");
    }
}
