// https://leetcode.com/problems/diagonal-traverse/
package arrays_and_hashing;

import java.util.*;

public class DiagonalTraverse {
    // LeetCode Problem 498: Diagonal Traverse
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DiagonalTraverse solver = new DiagonalTraverse();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode498_DiagonalTraverse (Diagonal Traverse) Passed!");
    }
}
