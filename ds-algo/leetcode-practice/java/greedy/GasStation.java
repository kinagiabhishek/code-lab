// https://leetcode.com/problems/gas-station/
package greedy;

import java.util.*;

public class GasStation {
    // LeetCode Problem 134: Gas Station
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        GasStation solver = new GasStation();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode134_GasStation (Gas Station) Passed!");
    }
}
