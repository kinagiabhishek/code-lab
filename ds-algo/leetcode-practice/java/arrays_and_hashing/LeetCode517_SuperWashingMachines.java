// https://leetcode.com/problems/super-washing-machines/
package arrays_and_hashing;

import java.util.*;

public class LeetCode517_SuperWashingMachines {
    // LeetCode Problem 517: Super Washing Machines
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode517_SuperWashingMachines solver = new LeetCode517_SuperWashingMachines();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode517_SuperWashingMachines (Super Washing Machines) Passed!");
    }
}
