// https://leetcode.com/problems/array-manipulation-363/
package arrays_and_hashing;

import java.util.*;

public class LeetCode363_ArraysAndHashing363 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode363_ArraysAndHashing363 solver = new LeetCode363_ArraysAndHashing363();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode363_ArraysAndHashing363 Passed!");
    }
}
