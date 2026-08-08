// https://leetcode.com/problems/array-manipulation-103/
package arrays_and_hashing;

import java.util.*;

public class LeetCode103_ArraysAndHashing103 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode103_ArraysAndHashing103 solver = new LeetCode103_ArraysAndHashing103();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode103_ArraysAndHashing103 Passed!");
    }
}
