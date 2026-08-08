// https://leetcode.com/problems/bit-manipulation-op-102/
package bit_manipulation;

import java.util.*;

public class LeetCode102_BitManipulation102 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode102_BitManipulation102 solver = new LeetCode102_BitManipulation102();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode102_BitManipulation102 Passed!");
    }
}
