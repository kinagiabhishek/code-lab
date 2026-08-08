// https://leetcode.com/problems/bit-manipulation-op-167/
package bit_manipulation;

import java.util.*;

public class LeetCode167_BitManipulation167 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode167_BitManipulation167 solver = new LeetCode167_BitManipulation167();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode167_BitManipulation167 Passed!");
    }
}
