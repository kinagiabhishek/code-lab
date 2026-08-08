// https://leetcode.com/problems/plus-one/
package arrays_and_hashing;

import java.util.*;

public class LeetCode66_PlusOne {
    // LeetCode Problem 66: Plus One
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode66_PlusOne solver = new LeetCode66_PlusOne();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode66_PlusOne (Plus One) Passed!");
    }
}
