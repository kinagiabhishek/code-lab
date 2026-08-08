// https://leetcode.com/problems/array-manipulation-181/
package arrays_and_hashing;

import java.util.*;

public class LeetCode181_ArraysAndHashing181 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode181_ArraysAndHashing181 solver = new LeetCode181_ArraysAndHashing181();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode181_ArraysAndHashing181 Passed!");
    }
}
