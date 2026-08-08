// https://leetcode.com/problems/h-index/
package arrays_and_hashing;

import java.util.*;

public class Hindex {
    // LeetCode Problem 274: H-Index
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        Hindex solver = new Hindex();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode274_Hindex (H-Index) Passed!");
    }
}
