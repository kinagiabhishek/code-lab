// https://leetcode.com/problems/bit-manipulation-op-193/
package bit_manipulation;

import java.util.*;

public class LeetCode193_BitManipulation193 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode193_BitManipulation193 solver = new LeetCode193_BitManipulation193();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode193_BitManipulation193 Passed!");
    }
}
