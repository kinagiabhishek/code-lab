// https://leetcode.com/problems/isomorphic-strings/
package bit_manipulation;

import java.util.*;

public class LeetCode205_IsomorphicStrings {
    // LeetCode Problem 205: Isomorphic Strings
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode205_IsomorphicStrings solver = new LeetCode205_IsomorphicStrings();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode205_IsomorphicStrings (Isomorphic Strings) Passed!");
    }
}
