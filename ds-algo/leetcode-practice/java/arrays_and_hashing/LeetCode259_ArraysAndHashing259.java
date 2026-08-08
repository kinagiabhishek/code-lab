// https://leetcode.com/problems/array-manipulation-259/
package arrays_and_hashing;

import java.util.*;

public class LeetCode259_ArraysAndHashing259 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode259_ArraysAndHashing259 solver = new LeetCode259_ArraysAndHashing259();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode259_ArraysAndHashing259 Passed!");
    }
}
