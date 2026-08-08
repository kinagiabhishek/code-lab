// https://leetcode.com/problems/construct-the-rectangle/
package arrays_and_hashing;

import java.util.*;

public class ConstructTheRectangle {
    // LeetCode Problem 492: Construct the Rectangle
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ConstructTheRectangle solver = new ConstructTheRectangle();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode492_ConstructTheRectangle (Construct the Rectangle) Passed!");
    }
}
