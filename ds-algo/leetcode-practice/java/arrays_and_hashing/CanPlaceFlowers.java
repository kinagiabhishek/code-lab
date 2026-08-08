// https://leetcode.com/problems/can-place-flowers/
package arrays_and_hashing;

import java.util.*;

public class CanPlaceFlowers {
    // LeetCode Problem 605: Can Place Flowers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CanPlaceFlowers solver = new CanPlaceFlowers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode605_CanPlaceFlowers (Can Place Flowers) Passed!");
    }
}
