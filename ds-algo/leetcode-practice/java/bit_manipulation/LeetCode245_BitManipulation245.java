// https://leetcode.com/problems/bit-manipulation-op-245/
package bit_manipulation;

import java.util.*;

public class LeetCode245_BitManipulation245 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode245_BitManipulation245 solver = new LeetCode245_BitManipulation245();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode245_BitManipulation245 Passed!");
    }
}
