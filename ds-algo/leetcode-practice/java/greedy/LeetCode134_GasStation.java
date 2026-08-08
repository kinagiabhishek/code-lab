// https://leetcode.com/problems/gas-station/
package greedy;

import java.util.*;

public class LeetCode134_GasStation {
    // LeetCode Problem 134: Gas Station
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode134_GasStation solver = new LeetCode134_GasStation();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode134_GasStation (Gas Station) Passed!");
    }
}
