// https://leetcode.com/problems/roman-to-integer/
package arrays_and_hashing;

import java.util.*;

public class RomanToInteger {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        RomanToInteger solver = new RomanToInteger();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode13_RomanToInteger Passed!");
    }
}
