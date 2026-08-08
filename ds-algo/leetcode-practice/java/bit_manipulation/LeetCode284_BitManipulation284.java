// https://leetcode.com/problems/bit-manipulation-op-284/
package bit_manipulation;

import java.util.*;

public class LeetCode284_BitManipulation284 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode284_BitManipulation284 solver = new LeetCode284_BitManipulation284();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode284_BitManipulation284 Passed!");
    }
}
