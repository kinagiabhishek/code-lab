// https://leetcode.com/problems/array-manipulation-129/
package arrays_and_hashing;

import java.util.*;

public class LeetCode129_ArraysAndHashing129 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode129_ArraysAndHashing129 solver = new LeetCode129_ArraysAndHashing129();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode129_ArraysAndHashing129 Passed!");
    }
}
