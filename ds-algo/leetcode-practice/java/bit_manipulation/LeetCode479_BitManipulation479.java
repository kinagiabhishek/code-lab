// https://leetcode.com/problems/bit-manipulation-op-479/
package bit_manipulation;

import java.util.*;

public class LeetCode479_BitManipulation479 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode479_BitManipulation479 solver = new LeetCode479_BitManipulation479();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode479_BitManipulation479 Passed!");
    }
}
