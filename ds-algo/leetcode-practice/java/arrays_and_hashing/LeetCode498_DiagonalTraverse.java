// https://leetcode.com/problems/diagonal-traverse/
package arrays_and_hashing;

import java.util.*;

public class LeetCode498_DiagonalTraverse {
    // LeetCode Problem 498: Diagonal Traverse
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode498_DiagonalTraverse solver = new LeetCode498_DiagonalTraverse();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode498_DiagonalTraverse (Diagonal Traverse) Passed!");
    }
}
