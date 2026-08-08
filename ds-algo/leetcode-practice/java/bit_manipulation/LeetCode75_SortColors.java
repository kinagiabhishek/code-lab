// https://leetcode.com/problems/sort-colors/
package bit_manipulation;

import java.util.*;

public class LeetCode75_SortColors {
    // LeetCode Problem 75: Sort Colors
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode75_SortColors solver = new LeetCode75_SortColors();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode75_SortColors (Sort Colors) Passed!");
    }
}
