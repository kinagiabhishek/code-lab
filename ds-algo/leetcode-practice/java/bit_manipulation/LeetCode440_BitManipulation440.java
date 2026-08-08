// https://leetcode.com/problems/bit-manipulation-op-440/
package bit_manipulation;

import java.util.*;

public class LeetCode440_BitManipulation440 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode440_BitManipulation440 solver = new LeetCode440_BitManipulation440();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode440_BitManipulation440 Passed!");
    }
}
