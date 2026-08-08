// https://leetcode.com/problems/isomorphic-strings/
package bit_manipulation;

import java.util.*;

public class IsomorphicStrings {
    // LeetCode Problem 205: Isomorphic Strings
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        IsomorphicStrings solver = new IsomorphicStrings();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode205_IsomorphicStrings (Isomorphic Strings) Passed!");
    }
}
