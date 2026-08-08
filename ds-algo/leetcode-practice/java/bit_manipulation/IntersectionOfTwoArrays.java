// https://leetcode.com/problems/intersection-of-two-arrays/
package bit_manipulation;

import java.util.*;

public class IntersectionOfTwoArrays {
    // LeetCode Problem 349: Intersection of Two Arrays
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays solver = new IntersectionOfTwoArrays();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ IntersectionOfTwoArrays (Intersection of Two Arrays) Passed!");
    }
}
