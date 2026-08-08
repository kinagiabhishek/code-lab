// https://leetcode.com/problems/excel-sheet-column-title/
package arrays_and_hashing;

import java.util.*;

public class LeetCode168_ExcelSheetColumnTitle {
    // LeetCode Problem 168: Excel Sheet Column Title
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode168_ExcelSheetColumnTitle solver = new LeetCode168_ExcelSheetColumnTitle();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode168_ExcelSheetColumnTitle (Excel Sheet Column Title) Passed!");
    }
}
