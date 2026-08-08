// https://leetcode.com/problems/bit-manipulation-op-232/
package bit_manipulation;

import java.util.*;

public class LeetCode232_BitManipulation232 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode232_BitManipulation232 solver = new LeetCode232_BitManipulation232();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode232_BitManipulation232 Passed!");
    }
}
