// https://leetcode.com/problems/bit-manipulation-op-518/
package bit_manipulation;

import java.util.*;

public class LeetCode518_BitManipulation518 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode518_BitManipulation518 solver = new LeetCode518_BitManipulation518();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode518_BitManipulation518 Passed!");
    }
}
