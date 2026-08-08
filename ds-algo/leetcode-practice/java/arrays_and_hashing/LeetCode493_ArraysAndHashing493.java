// https://leetcode.com/problems/array-manipulation-493/
package arrays_and_hashing;

import java.util.*;

public class LeetCode493_ArraysAndHashing493 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode493_ArraysAndHashing493 solver = new LeetCode493_ArraysAndHashing493();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode493_ArraysAndHashing493 Passed!");
    }
}
