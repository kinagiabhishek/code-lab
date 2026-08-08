// https://leetcode.com/problems/bit-manipulation-op-336/
package bit_manipulation;

import java.util.*;

public class LeetCode336_BitManipulation336 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode336_BitManipulation336 solver = new LeetCode336_BitManipulation336();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode336_BitManipulation336 Passed!");
    }
}
