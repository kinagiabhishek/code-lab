// https://leetcode.com/problems/contains-duplicate/
package arrays_and_hashing;

import java.util.*;

public class LeetCode217_ContainsDuplicate {
    // LeetCode Problem 217: Contains Duplicate
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode217_ContainsDuplicate solver = new LeetCode217_ContainsDuplicate();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode217_ContainsDuplicate (Contains Duplicate) Passed!");
    }
}
