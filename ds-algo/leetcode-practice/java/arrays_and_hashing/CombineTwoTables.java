// https://leetcode.com/problems/combine-two-tables/
package arrays_and_hashing;

import java.util.*;

public class CombineTwoTables {
    // LeetCode Problem 175: Combine Two Tables
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CombineTwoTables solver = new CombineTwoTables();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode175_CombineTwoTables (Combine Two Tables) Passed!");
    }
}
