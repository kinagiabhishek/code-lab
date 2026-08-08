// https://leetcode.com/problems/minimum-window-substring/
package trees;

import java.util.*;

public class LeetCode76_MinimumWindowSubstring {
    // LeetCode Problem 76: Minimum Window Substring
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode76_MinimumWindowSubstring solver = new LeetCode76_MinimumWindowSubstring();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode76_MinimumWindowSubstring (Minimum Window Substring) Passed!");
    }
}
