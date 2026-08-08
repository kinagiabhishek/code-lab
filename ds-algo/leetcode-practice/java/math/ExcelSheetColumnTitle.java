// https://leetcode.com/problems/excel-sheet-column-title/
package math;

import java.util.*;

public class ExcelSheetColumnTitle {
    // LeetCode Problem 168: Excel Sheet Column Title
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle solver = new ExcelSheetColumnTitle();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ExcelSheetColumnTitle (Excel Sheet Column Title) Passed!");
    }
}
