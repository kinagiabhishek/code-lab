// https://leetcode.com/problems/bit-manipulation-op-141/
package bit_manipulation;

import java.util.*;

public class LeetCode141_BitManipulation141 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode141_BitManipulation141 solver = new LeetCode141_BitManipulation141();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode141_BitManipulation141 Passed!");
    }
}
