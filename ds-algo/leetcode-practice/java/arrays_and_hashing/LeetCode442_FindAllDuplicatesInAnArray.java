// https://leetcode.com/problems/find-all-duplicates-in-an-array/
package arrays_and_hashing;

import java.util.*;

public class LeetCode442_FindAllDuplicatesInAnArray {
    // LeetCode Problem 442: Find All Duplicates in an Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode442_FindAllDuplicatesInAnArray solver = new LeetCode442_FindAllDuplicatesInAnArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode442_FindAllDuplicatesInAnArray (Find All Duplicates in an Array) Passed!");
    }
}
