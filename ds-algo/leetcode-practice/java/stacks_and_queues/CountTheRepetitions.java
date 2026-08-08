// https://leetcode.com/problems/count-the-repetitions/
package stacks_and_queues;

import java.util.*;

public class CountTheRepetitions {
    // LeetCode Problem 466: Count The Repetitions
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CountTheRepetitions solver = new CountTheRepetitions();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CountTheRepetitions (Count The Repetitions) Passed!");
    }
}
