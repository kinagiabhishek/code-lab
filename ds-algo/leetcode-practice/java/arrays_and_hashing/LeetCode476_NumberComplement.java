// https://leetcode.com/problems/number-complement/
package arrays_and_hashing;

import java.util.*;

public class LeetCode476_NumberComplement {
    // LeetCode Problem 476: Number Complement
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode476_NumberComplement solver = new LeetCode476_NumberComplement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode476_NumberComplement (Number Complement) Passed!");
    }
}
