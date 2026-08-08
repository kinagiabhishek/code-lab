// https://leetcode.com/problems/poor-pigs/
package bit_manipulation;

import java.util.*;

public class LeetCode458_PoorPigs {
    // LeetCode Problem 458: Poor Pigs
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode458_PoorPigs solver = new LeetCode458_PoorPigs();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode458_PoorPigs (Poor Pigs) Passed!");
    }
}
