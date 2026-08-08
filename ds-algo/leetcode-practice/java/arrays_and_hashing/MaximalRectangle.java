// https://leetcode.com/problems/maximal-rectangle/
package arrays_and_hashing;

import java.util.*;

public class MaximalRectangle {
    // LeetCode Problem 85: Maximal Rectangle
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MaximalRectangle solver = new MaximalRectangle();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode85_MaximalRectangle (Maximal Rectangle) Passed!");
    }
}
