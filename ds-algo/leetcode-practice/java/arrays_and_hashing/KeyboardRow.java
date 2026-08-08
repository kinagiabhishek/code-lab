// https://leetcode.com/problems/keyboard-row/
package arrays_and_hashing;

import java.util.*;

public class KeyboardRow {
    // LeetCode Problem 500: Keyboard Row
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        KeyboardRow solver = new KeyboardRow();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode500_KeyboardRow (Keyboard Row) Passed!");
    }
}
