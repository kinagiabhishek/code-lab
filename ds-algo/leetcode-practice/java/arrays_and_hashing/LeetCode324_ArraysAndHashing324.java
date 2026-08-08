// https://leetcode.com/problems/array-manipulation-324/
package arrays_and_hashing;

import java.util.*;

public class LeetCode324_ArraysAndHashing324 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode324_ArraysAndHashing324 solver = new LeetCode324_ArraysAndHashing324();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode324_ArraysAndHashing324 Passed!");
    }
}
