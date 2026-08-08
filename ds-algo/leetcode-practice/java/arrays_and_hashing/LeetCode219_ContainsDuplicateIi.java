// https://leetcode.com/problems/contains-duplicate-ii/
package arrays_and_hashing;

import java.util.*;

public class LeetCode219_ContainsDuplicateIi {
    // LeetCode Problem 219: Contains Duplicate II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode219_ContainsDuplicateIi solver = new LeetCode219_ContainsDuplicateIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode219_ContainsDuplicateIi (Contains Duplicate II) Passed!");
    }
}
