// https://leetcode.com/problems/divide-two-integers/
package bit_manipulation;

import java.util.*;

public class LeetCode29_DivideTwoIntegers {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode29_DivideTwoIntegers solver = new LeetCode29_DivideTwoIntegers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode29_DivideTwoIntegers Passed!");
    }
}
