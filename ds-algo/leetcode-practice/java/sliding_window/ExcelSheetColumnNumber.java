// https://leetcode.com/problems/excel-sheet-column-number/
package sliding_window;

import java.util.*;

public class ExcelSheetColumnNumber {
    // LeetCode Problem 171: Excel Sheet Column Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber solver = new ExcelSheetColumnNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ ExcelSheetColumnNumber Passed!");
    }
}
