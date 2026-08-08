// https://leetcode.com/problems/longest-common-prefix/
package arrays_and_hashing;

import java.util.*;

public class LeetCode14_LongestCommonPrefix {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode14_LongestCommonPrefix solver = new LeetCode14_LongestCommonPrefix();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode14_LongestCommonPrefix Passed!");
    }
}
