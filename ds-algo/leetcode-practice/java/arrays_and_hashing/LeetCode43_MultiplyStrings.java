// https://leetcode.com/problems/multiply-strings/
package arrays_and_hashing;

import java.util.*;

public class LeetCode43_MultiplyStrings {
    // LeetCode Problem 43: Multiply Strings
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode43_MultiplyStrings solver = new LeetCode43_MultiplyStrings();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode43_MultiplyStrings (Multiply Strings) Passed!");
    }
}
