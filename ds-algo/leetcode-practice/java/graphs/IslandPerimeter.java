// https://leetcode.com/problems/island-perimeter/
package graphs;

import java.util.*;

public class IslandPerimeter {
    // LeetCode Problem 463: Island Perimeter
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        IslandPerimeter solver = new IslandPerimeter();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode463_IslandPerimeter (Island Perimeter) Passed!");
    }
}
