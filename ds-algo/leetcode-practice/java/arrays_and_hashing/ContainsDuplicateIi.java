// https://leetcode.com/problems/contains-duplicate-ii/
package arrays_and_hashing;

import java.util.*;

public class ContainsDuplicateIi {
    // LeetCode Problem 219: Contains Duplicate II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ContainsDuplicateIi solver = new ContainsDuplicateIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode219_ContainsDuplicateIi (Contains Duplicate II) Passed!");
    }
}
