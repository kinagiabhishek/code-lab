// https://leetcode.com/problems/array-manipulation-51/
package arrays_and_hashing;

import java.util.*;

public class LeetCode51_ArraysAndHashing51 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode51_ArraysAndHashing51 solver = new LeetCode51_ArraysAndHashing51();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode51_ArraysAndHashing51 Passed!");
    }
}
