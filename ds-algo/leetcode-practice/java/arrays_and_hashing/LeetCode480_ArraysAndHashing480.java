// https://leetcode.com/problems/array-manipulation-480/
package arrays_and_hashing;

import java.util.*;

public class LeetCode480_ArraysAndHashing480 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode480_ArraysAndHashing480 solver = new LeetCode480_ArraysAndHashing480();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode480_ArraysAndHashing480 Passed!");
    }
}
