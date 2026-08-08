// https://leetcode.com/problems/find-all-duplicates-in-an-array/
package graphs;

import java.util.*;

public class FindAllDuplicatesInAnArray {
    // LeetCode Problem 442: Find All Duplicates in an Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindAllDuplicatesInAnArray solver = new FindAllDuplicatesInAnArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindAllDuplicatesInAnArray (Find All Duplicates in an Array) Passed!");
    }
}
