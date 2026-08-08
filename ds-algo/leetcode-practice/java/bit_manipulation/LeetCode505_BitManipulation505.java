// https://leetcode.com/problems/bit-manipulation-op-505/
package bit_manipulation;

import java.util.*;

public class LeetCode505_BitManipulation505 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode505_BitManipulation505 solver = new LeetCode505_BitManipulation505();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode505_BitManipulation505 Passed!");
    }
}
