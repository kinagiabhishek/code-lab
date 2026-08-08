// https://leetcode.com/problems/array-manipulation-194/
package arrays_and_hashing;

import java.util.*;

public class LeetCode194_ArraysAndHashing194 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode194_ArraysAndHashing194 solver = new LeetCode194_ArraysAndHashing194();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode194_ArraysAndHashing194 Passed!");
    }
}
