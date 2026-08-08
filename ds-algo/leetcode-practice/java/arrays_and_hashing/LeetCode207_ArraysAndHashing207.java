// https://leetcode.com/problems/array-manipulation-207/
package arrays_and_hashing;

import java.util.*;

public class LeetCode207_ArraysAndHashing207 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode207_ArraysAndHashing207 solver = new LeetCode207_ArraysAndHashing207();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode207_ArraysAndHashing207 Passed!");
    }
}
