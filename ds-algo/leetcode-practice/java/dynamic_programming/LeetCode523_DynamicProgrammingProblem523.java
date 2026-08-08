// https://leetcode.com/problems/problem-dp-523/
package dynamic_programming;

import java.util.*;

public class LeetCode523_DynamicProgrammingProblem523 {
    public int solve(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
    public static void main(String[] args) {
        LeetCode523_DynamicProgrammingProblem523 solver = new LeetCode523_DynamicProgrammingProblem523();
        assert solver.solve(5) == 8;
        System.out.println("✅ LeetCode523_DynamicProgrammingProblem523 Passed!");
    }
}
