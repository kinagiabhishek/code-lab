// https://leetcode.com/problems/bit-manipulation-op-180/
package bit_manipulation;

import java.util.*;

public class LeetCode180_BitManipulation180 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode180_BitManipulation180 solver = new LeetCode180_BitManipulation180();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode180_BitManipulation180 Passed!");
    }
}
