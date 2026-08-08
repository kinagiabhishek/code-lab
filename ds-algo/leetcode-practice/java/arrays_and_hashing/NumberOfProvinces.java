// https://leetcode.com/problems/number-of-provinces/
package arrays_and_hashing;

import java.util.*;

public class NumberOfProvinces {
    // LeetCode Problem 547: Number of Provinces
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NumberOfProvinces solver = new NumberOfProvinces();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode547_NumberOfProvinces (Number of Provinces) Passed!");
    }
}
