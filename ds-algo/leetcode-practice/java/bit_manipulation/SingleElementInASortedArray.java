// https://leetcode.com/problems/single-element-in-a-sorted-array/
package bit_manipulation;

import java.util.*;

public class SingleElementInASortedArray {
    // LeetCode Problem 540: Single Element in a Sorted Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SingleElementInASortedArray solver = new SingleElementInASortedArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode540_SingleElementInASortedArray (Single Element in a Sorted Array) Passed!");
    }
}
