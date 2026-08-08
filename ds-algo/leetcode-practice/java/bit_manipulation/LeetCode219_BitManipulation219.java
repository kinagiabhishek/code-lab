// https://leetcode.com/problems/bit-manipulation-op-219/
package bit_manipulation;

import java.util.*;

public class LeetCode219_BitManipulation219 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode219_BitManipulation219 solver = new LeetCode219_BitManipulation219();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode219_BitManipulation219 Passed!");
    }
}
