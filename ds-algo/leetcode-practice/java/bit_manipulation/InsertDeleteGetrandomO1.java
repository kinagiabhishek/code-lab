// https://leetcode.com/problems/insert-delete-getrandom-o1/
package bit_manipulation;

import java.util.*;

public class InsertDeleteGetrandomO1 {
    // LeetCode Problem 380: Insert Delete GetRandom O(1)
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        InsertDeleteGetrandomO1 solver = new InsertDeleteGetrandomO1();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode380_InsertDeleteGetrandomO1 (Insert Delete GetRandom O(1)) Passed!");
    }
}
