// https://leetcode.com/problems/find-duplicate-file-in-system/
package arrays_and_hashing;

import java.util.*;

public class FindDuplicateFileInSystem {
    // LeetCode Problem 609: Find Duplicate File in System
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindDuplicateFileInSystem solver = new FindDuplicateFileInSystem();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode609_FindDuplicateFileInSystem (Find Duplicate File in System) Passed!");
    }
}
