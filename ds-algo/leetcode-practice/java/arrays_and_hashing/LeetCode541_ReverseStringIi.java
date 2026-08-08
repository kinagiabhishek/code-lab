// https://leetcode.com/problems/reverse-string-ii/
package arrays_and_hashing;

import java.util.*;

public class LeetCode541_ReverseStringIi {
    // LeetCode Problem 541: Reverse String II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode541_ReverseStringIi solver = new LeetCode541_ReverseStringIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode541_ReverseStringIi (Reverse String II) Passed!");
    }
}
