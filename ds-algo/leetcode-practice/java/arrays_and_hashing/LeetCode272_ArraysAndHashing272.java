// https://leetcode.com/problems/array-manipulation-272/
package arrays_and_hashing;

import java.util.*;

public class LeetCode272_ArraysAndHashing272 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode272_ArraysAndHashing272 solver = new LeetCode272_ArraysAndHashing272();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode272_ArraysAndHashing272 Passed!");
    }
}
