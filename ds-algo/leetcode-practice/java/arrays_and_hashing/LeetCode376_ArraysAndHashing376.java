// https://leetcode.com/problems/array-manipulation-376/
package arrays_and_hashing;

import java.util.*;

public class LeetCode376_ArraysAndHashing376 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode376_ArraysAndHashing376 solver = new LeetCode376_ArraysAndHashing376();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode376_ArraysAndHashing376 Passed!");
    }
}
