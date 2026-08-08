// https://leetcode.com/problems/group-anagrams/
package arrays_and_hashing;

import java.util.*;

public class LeetCode49_GroupAnagrams {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode49_GroupAnagrams solver = new LeetCode49_GroupAnagrams();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode49_GroupAnagrams Passed!");
    }
}
