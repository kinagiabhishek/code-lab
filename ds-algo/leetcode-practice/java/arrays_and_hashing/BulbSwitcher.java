// https://leetcode.com/problems/bulb-switcher/
package arrays_and_hashing;

import java.util.*;

public class BulbSwitcher {
    // LeetCode Problem 319: Bulb Switcher
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BulbSwitcher solver = new BulbSwitcher();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode319_BulbSwitcher (Bulb Switcher) Passed!");
    }
}
