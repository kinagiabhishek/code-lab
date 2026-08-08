// https://leetcode.com/problems/array-manipulation-116/
package arrays_and_hashing;

import java.util.*;

public class LeetCode116_ArraysAndHashing116 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode116_ArraysAndHashing116 solver = new LeetCode116_ArraysAndHashing116();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode116_ArraysAndHashing116 Passed!");
    }
}
