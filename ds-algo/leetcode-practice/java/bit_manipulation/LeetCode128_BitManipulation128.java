// https://leetcode.com/problems/bit-manipulation-op-128/
package bit_manipulation;

import java.util.*;

public class LeetCode128_BitManipulation128 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode128_BitManipulation128 solver = new LeetCode128_BitManipulation128();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode128_BitManipulation128 Passed!");
    }
}
