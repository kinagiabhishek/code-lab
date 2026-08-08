// https://leetcode.com/problems/bit-manipulation-op-323/
package bit_manipulation;

import java.util.*;

public class LeetCode323_BitManipulation323 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode323_BitManipulation323 solver = new LeetCode323_BitManipulation323();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode323_BitManipulation323 Passed!");
    }
}
