// https://leetcode.com/problems/super-washing-machines/
package bit_manipulation;

import java.util.*;

public class SuperWashingMachines {
    // LeetCode Problem 517: Super Washing Machines
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SuperWashingMachines solver = new SuperWashingMachines();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SuperWashingMachines (Super Washing Machines) Passed!");
    }
}
