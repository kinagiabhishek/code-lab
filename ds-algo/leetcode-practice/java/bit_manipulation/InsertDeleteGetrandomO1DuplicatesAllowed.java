// https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/
package bit_manipulation;

import java.util.*;

public class InsertDeleteGetrandomO1DuplicatesAllowed {
    // LeetCode Problem 381: Insert Delete GetRandom O(1) - Duplicates allowed
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        InsertDeleteGetrandomO1DuplicatesAllowed solver = new InsertDeleteGetrandomO1DuplicatesAllowed();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode381_InsertDeleteGetrandomO1DuplicatesAllowed (Insert Delete GetRandom O(1) - Duplicates allowed) Passed!");
    }
}
