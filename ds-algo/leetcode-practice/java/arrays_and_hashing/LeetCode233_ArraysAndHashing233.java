// https://leetcode.com/problems/array-manipulation-233/
package arrays_and_hashing;

import java.util.*;

public class LeetCode233_ArraysAndHashing233 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode233_ArraysAndHashing233 solver = new LeetCode233_ArraysAndHashing233();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode233_ArraysAndHashing233 Passed!");
    }
}
