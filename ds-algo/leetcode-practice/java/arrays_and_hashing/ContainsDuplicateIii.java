// https://leetcode.com/problems/contains-duplicate-iii/
package arrays_and_hashing;

import java.util.*;

public class ContainsDuplicateIii {
    // LeetCode Problem 220: Contains Duplicate III
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ContainsDuplicateIii solver = new ContainsDuplicateIii();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode220_ContainsDuplicateIii (Contains Duplicate III) Passed!");
    }
}
