// https://leetcode.com/problems/array-manipulation-428/
package arrays_and_hashing;

import java.util.*;

public class LeetCode428_ArraysAndHashing428 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode428_ArraysAndHashing428 solver = new LeetCode428_ArraysAndHashing428();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode428_ArraysAndHashing428 Passed!");
    }
}
