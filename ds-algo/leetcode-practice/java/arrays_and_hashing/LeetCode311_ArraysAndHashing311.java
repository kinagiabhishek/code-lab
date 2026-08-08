// https://leetcode.com/problems/array-manipulation-311/
package arrays_and_hashing;

import java.util.*;

public class LeetCode311_ArraysAndHashing311 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode311_ArraysAndHashing311 solver = new LeetCode311_ArraysAndHashing311();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode311_ArraysAndHashing311 Passed!");
    }
}
