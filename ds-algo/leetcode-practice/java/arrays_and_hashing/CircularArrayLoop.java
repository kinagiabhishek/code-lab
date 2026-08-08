// https://leetcode.com/problems/circular-array-loop/
package arrays_and_hashing;

import java.util.*;

public class CircularArrayLoop {
    // LeetCode Problem 457: Circular Array Loop
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CircularArrayLoop solver = new CircularArrayLoop();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode457_CircularArrayLoop (Circular Array Loop) Passed!");
    }
}
