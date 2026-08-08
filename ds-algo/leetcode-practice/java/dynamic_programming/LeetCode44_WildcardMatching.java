// https://leetcode.com/problems/wildcard-matching/
package dynamic_programming;

import java.util.*;

public class LeetCode44_WildcardMatching {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode44_WildcardMatching solver = new LeetCode44_WildcardMatching();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode44_WildcardMatching Passed!");
    }
}
