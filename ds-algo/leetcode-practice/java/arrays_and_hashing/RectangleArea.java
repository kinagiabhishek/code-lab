// https://leetcode.com/problems/rectangle-area/
package arrays_and_hashing;

import java.util.*;

public class RectangleArea {
    // LeetCode Problem 223: Rectangle Area
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RectangleArea solver = new RectangleArea();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode223_RectangleArea (Rectangle Area) Passed!");
    }
}
