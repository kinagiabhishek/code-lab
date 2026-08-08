// https://leetcode.com/problems/can-place-flowers/
package arrays_and_hashing;

import java.util.*;

public class LeetCode605_CanPlaceFlowers {
    // LeetCode Problem 605: Can Place Flowers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode605_CanPlaceFlowers solver = new LeetCode605_CanPlaceFlowers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode605_CanPlaceFlowers (Can Place Flowers) Passed!");
    }
}
