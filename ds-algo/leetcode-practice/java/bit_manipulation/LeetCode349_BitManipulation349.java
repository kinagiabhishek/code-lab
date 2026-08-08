// https://leetcode.com/problems/bit-manipulation-op-349/
package bit_manipulation;

import java.util.*;

public class LeetCode349_BitManipulation349 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode349_BitManipulation349 solver = new LeetCode349_BitManipulation349();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode349_BitManipulation349 Passed!");
    }
}
