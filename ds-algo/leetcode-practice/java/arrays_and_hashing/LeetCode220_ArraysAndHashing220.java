// https://leetcode.com/problems/array-manipulation-220/
package arrays_and_hashing;

import java.util.*;

public class LeetCode220_ArraysAndHashing220 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode220_ArraysAndHashing220 solver = new LeetCode220_ArraysAndHashing220();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode220_ArraysAndHashing220 Passed!");
    }
}
