// https://leetcode.com/problems/bit-manipulation-op-414/
package bit_manipulation;

import java.util.*;

public class LeetCode414_BitManipulation414 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode414_BitManipulation414 solver = new LeetCode414_BitManipulation414();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode414_BitManipulation414 Passed!");
    }
}
