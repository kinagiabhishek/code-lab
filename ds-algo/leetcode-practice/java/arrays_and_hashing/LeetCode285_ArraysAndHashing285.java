// https://leetcode.com/problems/array-manipulation-285/
package arrays_and_hashing;

import java.util.*;

public class LeetCode285_ArraysAndHashing285 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode285_ArraysAndHashing285 solver = new LeetCode285_ArraysAndHashing285();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode285_ArraysAndHashing285 Passed!");
    }
}
