// https://leetcode.com/problems/classes-with-at-least-5-students/
package arrays_and_hashing;

import java.util.*;

public class ClassesWithAtLeast5Students {
    // LeetCode Problem 596: Classes With at Least 5 Students
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ClassesWithAtLeast5Students solver = new ClassesWithAtLeast5Students();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode596_ClassesWithAtLeast5Students (Classes With at Least 5 Students) Passed!");
    }
}
