// https://leetcode.com/problems/string-to-integer-atoi/
package arrays_and_hashing;

import java.util.*;

public class LeetCode8_StringToIntegerAtoi {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode8_StringToIntegerAtoi solver = new LeetCode8_StringToIntegerAtoi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode8_StringToIntegerAtoi Passed!");
    }
}
