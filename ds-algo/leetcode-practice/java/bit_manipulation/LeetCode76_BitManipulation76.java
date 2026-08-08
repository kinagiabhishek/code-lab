// https://leetcode.com/problems/bit-manipulation-op-76/
package bit_manipulation;

import java.util.*;

public class LeetCode76_BitManipulation76 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode76_BitManipulation76 solver = new LeetCode76_BitManipulation76();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode76_BitManipulation76 Passed!");
    }
}
