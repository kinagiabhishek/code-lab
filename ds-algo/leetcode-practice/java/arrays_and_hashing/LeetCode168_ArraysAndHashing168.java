// https://leetcode.com/problems/array-manipulation-168/
package arrays_and_hashing;

import java.util.*;

public class LeetCode168_ArraysAndHashing168 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode168_ArraysAndHashing168 solver = new LeetCode168_ArraysAndHashing168();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode168_ArraysAndHashing168 Passed!");
    }
}
