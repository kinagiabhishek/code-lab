// https://leetcode.com/problems/array-manipulation-337/
package arrays_and_hashing;

import java.util.*;

public class LeetCode337_ArraysAndHashing337 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode337_ArraysAndHashing337 solver = new LeetCode337_ArraysAndHashing337();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode337_ArraysAndHashing337 Passed!");
    }
}
