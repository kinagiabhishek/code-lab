// https://leetcode.com/problems/array-manipulation-77/
package arrays_and_hashing;

import java.util.*;

public class LeetCode77_ArraysAndHashing77 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode77_ArraysAndHashing77 solver = new LeetCode77_ArraysAndHashing77();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode77_ArraysAndHashing77 Passed!");
    }
}
