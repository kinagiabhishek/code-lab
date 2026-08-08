// https://leetcode.com/problems/bit-manipulation-op-258/
package bit_manipulation;

import java.util.*;

public class LeetCode258_BitManipulation258 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode258_BitManipulation258 solver = new LeetCode258_BitManipulation258();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode258_BitManipulation258 Passed!");
    }
}
