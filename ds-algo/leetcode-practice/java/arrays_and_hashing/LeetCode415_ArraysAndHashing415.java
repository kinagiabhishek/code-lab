// https://leetcode.com/problems/array-manipulation-415/
package arrays_and_hashing;

import java.util.*;

public class LeetCode415_ArraysAndHashing415 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode415_ArraysAndHashing415 solver = new LeetCode415_ArraysAndHashing415();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode415_ArraysAndHashing415 Passed!");
    }
}
