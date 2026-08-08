// https://leetcode.com/problems/bit-manipulation-op-297/
package bit_manipulation;

import java.util.*;

public class LeetCode297_BitManipulation297 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode297_BitManipulation297 solver = new LeetCode297_BitManipulation297();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode297_BitManipulation297 Passed!");
    }
}
