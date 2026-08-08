// https://leetcode.com/problems/bit-manipulation-op-362/
package bit_manipulation;

import java.util.*;

public class LeetCode362_BitManipulation362 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode362_BitManipulation362 solver = new LeetCode362_BitManipulation362();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode362_BitManipulation362 Passed!");
    }
}
