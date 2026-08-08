// https://leetcode.com/problems/array-manipulation-64/
package arrays_and_hashing;

import java.util.*;

public class LeetCode64_ArraysAndHashing64 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode64_ArraysAndHashing64 solver = new LeetCode64_ArraysAndHashing64();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode64_ArraysAndHashing64 Passed!");
    }
}
