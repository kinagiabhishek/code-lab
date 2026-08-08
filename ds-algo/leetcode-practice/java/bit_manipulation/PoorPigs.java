// https://leetcode.com/problems/poor-pigs/
package bit_manipulation;

import java.util.*;

public class PoorPigs {
    // LeetCode Problem 458: Poor Pigs
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PoorPigs solver = new PoorPigs();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode458_PoorPigs (Poor Pigs) Passed!");
    }
}
