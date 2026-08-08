// https://leetcode.com/problems/bit-manipulation-op-492/
package bit_manipulation;

import java.util.*;

public class LeetCode492_BitManipulation492 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode492_BitManipulation492 solver = new LeetCode492_BitManipulation492();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode492_BitManipulation492 Passed!");
    }
}
