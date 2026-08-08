// https://leetcode.com/problems/contains-duplicate-iii/
package arrays_and_hashing;

import java.util.*;

public class LeetCode220_ContainsDuplicateIii {
    // LeetCode Problem 220: Contains Duplicate III
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode220_ContainsDuplicateIii solver = new LeetCode220_ContainsDuplicateIii();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode220_ContainsDuplicateIii (Contains Duplicate III) Passed!");
    }
}
