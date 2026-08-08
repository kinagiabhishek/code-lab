// https://leetcode.com/problems/bit-manipulation-op-271/
package bit_manipulation;

import java.util.*;

public class LeetCode271_BitManipulation271 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode271_BitManipulation271 solver = new LeetCode271_BitManipulation271();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode271_BitManipulation271 Passed!");
    }
}
