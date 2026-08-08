// https://leetcode.com/problems/array-manipulation-519/
package arrays_and_hashing;

import java.util.*;

public class LeetCode519_ArraysAndHashing519 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode519_ArraysAndHashing519 solver = new LeetCode519_ArraysAndHashing519();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode519_ArraysAndHashing519 Passed!");
    }
}
