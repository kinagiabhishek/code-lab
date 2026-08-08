// https://leetcode.com/problems/array-manipulation-454/
package arrays_and_hashing;

import java.util.*;

public class LeetCode454_ArraysAndHashing454 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode454_ArraysAndHashing454 solver = new LeetCode454_ArraysAndHashing454();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode454_ArraysAndHashing454 Passed!");
    }
}
