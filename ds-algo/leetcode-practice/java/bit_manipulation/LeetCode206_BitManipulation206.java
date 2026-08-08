// https://leetcode.com/problems/bit-manipulation-op-206/
package bit_manipulation;

import java.util.*;

public class LeetCode206_BitManipulation206 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode206_BitManipulation206 solver = new LeetCode206_BitManipulation206();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode206_BitManipulation206 Passed!");
    }
}
