// https://leetcode.com/problems/array-manipulation-90/
package arrays_and_hashing;

import java.util.*;

public class LeetCode90_ArraysAndHashing90 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode90_ArraysAndHashing90 solver = new LeetCode90_ArraysAndHashing90();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode90_ArraysAndHashing90 Passed!");
    }
}
