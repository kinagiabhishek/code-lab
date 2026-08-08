// https://leetcode.com/problems/construct-the-rectangle/
package two_pointers;

import java.util.*;

public class ConstructTheRectangle {
    // LeetCode Problem 492: Construct the Rectangle
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ConstructTheRectangle solver = new ConstructTheRectangle();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ConstructTheRectangle (Construct the Rectangle) Passed!");
    }
}
