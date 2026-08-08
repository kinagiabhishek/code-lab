// https://leetcode.com/problems/problem-dp-519/
package dynamic_programming;

import java.util.*;

public class LeetCode519_DynamicProgrammingProblem519 {
    public int solve(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
    public static void main(String[] args) {
        LeetCode519_DynamicProgrammingProblem519 solver = new LeetCode519_DynamicProgrammingProblem519();
        assert solver.solve(5) == 8;
        System.out.println("✅ LeetCode519_DynamicProgrammingProblem519 Passed!");
    }
}
