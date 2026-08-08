// https://leetcode.com/problems/array-manipulation-155/
package arrays_and_hashing;

import java.util.*;

public class LeetCode155_ArraysAndHashing155 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode155_ArraysAndHashing155 solver = new LeetCode155_ArraysAndHashing155();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode155_ArraysAndHashing155 Passed!");
    }
}
