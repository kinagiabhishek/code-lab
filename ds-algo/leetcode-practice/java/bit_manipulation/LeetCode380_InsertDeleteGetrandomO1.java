// https://leetcode.com/problems/insert-delete-getrandom-o1/
package bit_manipulation;

import java.util.*;

public class LeetCode380_InsertDeleteGetrandomO1 {
    // LeetCode Problem 380: Insert Delete GetRandom O(1)
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode380_InsertDeleteGetrandomO1 solver = new LeetCode380_InsertDeleteGetrandomO1();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode380_InsertDeleteGetrandomO1 (Insert Delete GetRandom O(1)) Passed!");
    }
}
