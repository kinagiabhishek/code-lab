// https://leetcode.com/problems/array-manipulation-350/
package arrays_and_hashing;

import java.util.*;

public class LeetCode350_ArraysAndHashing350 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode350_ArraysAndHashing350 solver = new LeetCode350_ArraysAndHashing350();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode350_ArraysAndHashing350 Passed!");
    }
}
