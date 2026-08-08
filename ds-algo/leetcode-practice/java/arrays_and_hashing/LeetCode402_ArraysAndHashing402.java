// https://leetcode.com/problems/array-manipulation-402/
package arrays_and_hashing;

import java.util.*;

public class LeetCode402_ArraysAndHashing402 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode402_ArraysAndHashing402 solver = new LeetCode402_ArraysAndHashing402();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode402_ArraysAndHashing402 Passed!");
    }
}
