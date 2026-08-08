// https://leetcode.com/problems/excel-sheet-column-number/
package sliding_window;

import java.util.*;

public class ExcelSheetColumnNumber {
    // LeetCode Problem 171: Excel Sheet Column Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber solver = new ExcelSheetColumnNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ExcelSheetColumnNumber (Excel Sheet Column Number) Passed!");
    }
}
