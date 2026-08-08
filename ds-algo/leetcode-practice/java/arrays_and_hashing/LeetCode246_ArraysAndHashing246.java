// https://leetcode.com/problems/array-manipulation-246/
package arrays_and_hashing;

import java.util.*;

public class LeetCode246_ArraysAndHashing246 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode246_ArraysAndHashing246 solver = new LeetCode246_ArraysAndHashing246();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode246_ArraysAndHashing246 Passed!");
    }
}
