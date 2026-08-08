// https://leetcode.com/problems/bit-manipulation-op-154/
package bit_manipulation;

import java.util.*;

public class LeetCode154_BitManipulation154 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode154_BitManipulation154 solver = new LeetCode154_BitManipulation154();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode154_BitManipulation154 Passed!");
    }
}
