// https://leetcode.com/problems/array-manipulation-441/
package arrays_and_hashing;

import java.util.*;

public class LeetCode441_ArraysAndHashing441 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode441_ArraysAndHashing441 solver = new LeetCode441_ArraysAndHashing441();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode441_ArraysAndHashing441 Passed!");
    }
}
