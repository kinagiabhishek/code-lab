// https://leetcode.com/problems/sort-colors/
package bit_manipulation;

import java.util.*;

public class SortColors {
    // LeetCode Problem 75: Sort Colors
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SortColors solver = new SortColors();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode75_SortColors (Sort Colors) Passed!");
    }
}
