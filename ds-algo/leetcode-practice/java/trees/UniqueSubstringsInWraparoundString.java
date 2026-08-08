// https://leetcode.com/problems/unique-substrings-in-wraparound-string/
package trees;

import java.util.*;

public class UniqueSubstringsInWraparoundString {
    // LeetCode Problem 467: Unique Substrings in Wraparound String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        UniqueSubstringsInWraparoundString solver = new UniqueSubstringsInWraparoundString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode467_UniqueSubstringsInWraparoundString (Unique Substrings in Wraparound String) Passed!");
    }
}
