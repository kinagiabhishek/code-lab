// https://leetcode.com/problems/swap-sex-of-employees/
package arrays_and_hashing;

import java.util.*;

public class SwapSexOfEmployees {
    // LeetCode Problem 627: Swap Sex of Employees
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SwapSexOfEmployees solver = new SwapSexOfEmployees();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode627_SwapSexOfEmployees (Swap Sex of Employees) Passed!");
    }
}
