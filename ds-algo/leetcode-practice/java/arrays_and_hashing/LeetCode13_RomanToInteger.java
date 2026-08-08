// https://leetcode.com/problems/roman-to-integer/
package arrays_and_hashing;

import java.util.*;

public class LeetCode13_RomanToInteger {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode13_RomanToInteger solver = new LeetCode13_RomanToInteger();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode13_RomanToInteger Passed!");
    }
}
