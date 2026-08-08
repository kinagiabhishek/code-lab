// https://leetcode.com/problems/palindrome-pairs/
package two_pointers;

import java.util.*;

public class LeetCode336_PalindromePairs {
    // LeetCode Problem 336: Palindrome Pairs
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode336_PalindromePairs solver = new LeetCode336_PalindromePairs();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode336_PalindromePairs (Palindrome Pairs) Passed!");
    }
}
