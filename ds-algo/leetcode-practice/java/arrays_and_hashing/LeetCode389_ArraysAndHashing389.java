// https://leetcode.com/problems/array-manipulation-389/
package arrays_and_hashing;

import java.util.*;

public class LeetCode389_ArraysAndHashing389 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode389_ArraysAndHashing389 solver = new LeetCode389_ArraysAndHashing389();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode389_ArraysAndHashing389 Passed!");
    }
}
