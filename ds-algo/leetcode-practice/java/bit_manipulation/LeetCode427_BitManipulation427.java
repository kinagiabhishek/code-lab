// https://leetcode.com/problems/bit-manipulation-op-427/
package bit_manipulation;

import java.util.*;

public class LeetCode427_BitManipulation427 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode427_BitManipulation427 solver = new LeetCode427_BitManipulation427();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode427_BitManipulation427 Passed!");
    }
}
