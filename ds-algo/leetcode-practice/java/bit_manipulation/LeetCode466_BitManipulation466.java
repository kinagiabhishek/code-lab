// https://leetcode.com/problems/bit-manipulation-op-466/
package bit_manipulation;

import java.util.*;

public class LeetCode466_BitManipulation466 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode466_BitManipulation466 solver = new LeetCode466_BitManipulation466();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode466_BitManipulation466 Passed!");
    }
}
