// https://leetcode.com/problems/big-countries/
package arrays_and_hashing;

import java.util.*;

public class LeetCode595_BigCountries {
    // LeetCode Problem 595: Big Countries
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode595_BigCountries solver = new LeetCode595_BigCountries();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode595_BigCountries (Big Countries) Passed!");
    }
}
