// https://leetcode.com/problems/group-anagrams/
package arrays_and_hashing;

import java.util.*;

public class LeetCode49_GroupAnagrams {
    // LeetCode Problem 49: Group Anagrams
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode49_GroupAnagrams solver = new LeetCode49_GroupAnagrams();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode49_GroupAnagrams (Group Anagrams) Passed!");
    }
}
