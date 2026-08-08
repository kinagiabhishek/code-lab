// https://leetcode.com/problems/array-manipulation-506/
package arrays_and_hashing;

import java.util.*;

public class LeetCode506_ArraysAndHashing506 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode506_ArraysAndHashing506 solver = new LeetCode506_ArraysAndHashing506();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode506_ArraysAndHashing506 Passed!");
    }
}
