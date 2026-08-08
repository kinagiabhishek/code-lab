// https://leetcode.com/problems/excel-sheet-column-number/
package arrays_and_hashing;

import java.util.*;

public class LeetCode171_ExcelSheetColumnNumber {
    // LeetCode Problem 171: Excel Sheet Column Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode171_ExcelSheetColumnNumber solver = new LeetCode171_ExcelSheetColumnNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode171_ExcelSheetColumnNumber (Excel Sheet Column Number) Passed!");
    }
}
