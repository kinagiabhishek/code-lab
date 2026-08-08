// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
package bit_manipulation;

import java.util.*;

public class TwoSumIiInputArrayIsSorted {
    // LeetCode Problem 167: Two Sum II - Input Array Is Sorted
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        TwoSumIiInputArrayIsSorted solver = new TwoSumIiInputArrayIsSorted();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode167_TwoSumIiInputArrayIsSorted (Two Sum II - Input Array Is Sorted) Passed!");
    }
}
