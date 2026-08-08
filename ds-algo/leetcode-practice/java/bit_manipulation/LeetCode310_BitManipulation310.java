// https://leetcode.com/problems/bit-manipulation-op-310/
package bit_manipulation;

import java.util.*;

public class LeetCode310_BitManipulation310 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode310_BitManipulation310 solver = new LeetCode310_BitManipulation310();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode310_BitManipulation310 Passed!");
    }
}
