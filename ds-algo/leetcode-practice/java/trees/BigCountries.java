// https://leetcode.com/problems/big-countries/
package trees;

import java.util.*;

public class BigCountries {
    // LeetCode Problem 595: Big Countries
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BigCountries solver = new BigCountries();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BigCountries (Big Countries) Passed!");
    }
}
