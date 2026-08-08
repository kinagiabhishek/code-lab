// https://leetcode.com/problems/bit-manipulation-op-63/
package bit_manipulation;

import java.util.*;

public class LeetCode63_BitManipulation63 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode63_BitManipulation63 solver = new LeetCode63_BitManipulation63();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode63_BitManipulation63 Passed!");
    }
}
