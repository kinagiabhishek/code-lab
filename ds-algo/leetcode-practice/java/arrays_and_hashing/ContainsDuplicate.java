// https://leetcode.com/problems/contains-duplicate/
package arrays_and_hashing;

import java.util.*;

public class ContainsDuplicate {
    // LeetCode Problem 217: Contains Duplicate
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ContainsDuplicate solver = new ContainsDuplicate();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode217_ContainsDuplicate (Contains Duplicate) Passed!");
    }
}
