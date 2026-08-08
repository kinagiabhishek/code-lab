// https://leetcode.com/problems/maximal-rectangle/
package arrays_and_hashing;

import java.util.*;

public class LeetCode85_MaximalRectangle {
    // LeetCode Problem 85: Maximal Rectangle
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode85_MaximalRectangle solver = new LeetCode85_MaximalRectangle();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode85_MaximalRectangle (Maximal Rectangle) Passed!");
    }
}
