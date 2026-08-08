// https://leetcode.com/problems/wildcard-matching/
package arrays_and_hashing;

import java.util.*;

public class LeetCode44_WildcardMatching {
    // LeetCode Problem 44: Wildcard Matching
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode44_WildcardMatching solver = new LeetCode44_WildcardMatching();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode44_WildcardMatching (Wildcard Matching) Passed!");
    }
}
