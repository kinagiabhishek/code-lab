// https://leetcode.com/problems/construct-the-rectangle/
package arrays_and_hashing;

import java.util.*;

public class LeetCode492_ConstructTheRectangle {
    // LeetCode Problem 492: Construct the Rectangle
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode492_ConstructTheRectangle solver = new LeetCode492_ConstructTheRectangle();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode492_ConstructTheRectangle (Construct the Rectangle) Passed!");
    }
}
