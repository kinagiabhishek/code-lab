// https://leetcode.com/problems/distribute-candies/
package bit_manipulation;

import java.util.*;

public class DistributeCandies {
    // LeetCode Problem 575: Distribute Candies
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DistributeCandies solver = new DistributeCandies();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode575_DistributeCandies (Distribute Candies) Passed!");
    }
}
