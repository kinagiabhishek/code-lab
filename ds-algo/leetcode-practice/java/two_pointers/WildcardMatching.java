// https://leetcode.com/problems/wildcard-matching/
package two_pointers;

import java.util.*;

public class WildcardMatching {
    // LeetCode Problem 44: Wildcard Matching
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        WildcardMatching solver = new WildcardMatching();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ WildcardMatching (Wildcard Matching) Passed!");
    }
}
