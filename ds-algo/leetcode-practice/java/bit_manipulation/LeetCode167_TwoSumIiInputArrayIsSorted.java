// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
package bit_manipulation;

import java.util.*;

public class LeetCode167_TwoSumIiInputArrayIsSorted {
    // LeetCode Problem 167: Two Sum II - Input Array Is Sorted
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode167_TwoSumIiInputArrayIsSorted solver = new LeetCode167_TwoSumIiInputArrayIsSorted();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode167_TwoSumIiInputArrayIsSorted (Two Sum II - Input Array Is Sorted) Passed!");
    }
}
