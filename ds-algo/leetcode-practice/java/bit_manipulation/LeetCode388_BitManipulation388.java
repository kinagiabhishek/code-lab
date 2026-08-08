// https://leetcode.com/problems/bit-manipulation-op-388/
package bit_manipulation;

import java.util.*;

public class LeetCode388_BitManipulation388 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode388_BitManipulation388 solver = new LeetCode388_BitManipulation388();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode388_BitManipulation388 Passed!");
    }
}
