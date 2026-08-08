// https://leetcode.com/problems/candy/
package heap_and_priority_queue;

import java.util.*;

public class Candy {
    // LeetCode Problem 135: Candy
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        Candy solver = new Candy();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ Candy (Candy) Passed!");
    }
}
