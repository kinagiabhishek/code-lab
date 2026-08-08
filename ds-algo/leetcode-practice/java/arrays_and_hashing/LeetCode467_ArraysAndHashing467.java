// https://leetcode.com/problems/array-manipulation-467/
package arrays_and_hashing;

import java.util.*;

public class LeetCode467_ArraysAndHashing467 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode467_ArraysAndHashing467 solver = new LeetCode467_ArraysAndHashing467();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode467_ArraysAndHashing467 Passed!");
    }
}
