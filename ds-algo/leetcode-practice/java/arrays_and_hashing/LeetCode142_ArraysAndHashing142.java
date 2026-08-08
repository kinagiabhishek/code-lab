// https://leetcode.com/problems/array-manipulation-142/
package arrays_and_hashing;

import java.util.*;

public class LeetCode142_ArraysAndHashing142 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode142_ArraysAndHashing142 solver = new LeetCode142_ArraysAndHashing142();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode142_ArraysAndHashing142 Passed!");
    }
}
