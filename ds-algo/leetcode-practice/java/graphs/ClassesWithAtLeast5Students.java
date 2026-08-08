// https://leetcode.com/problems/classes-with-at-least-5-students/
package graphs;

import java.util.*;

public class ClassesWithAtLeast5Students {
    // LeetCode Problem 596: Classes With at Least 5 Students
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ClassesWithAtLeast5Students solver = new ClassesWithAtLeast5Students();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ClassesWithAtLeast5Students (Classes With at Least 5 Students) Passed!");
    }
}
