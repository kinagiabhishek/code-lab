// https://leetcode.com/problems/problem-dp-514/
package dynamic_programming;

import java.util.*;

public class LeetCode514_DynamicProgrammingProblem514 {
    public int solve(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
    public static void main(String[] args) {
        LeetCode514_DynamicProgrammingProblem514 solver = new LeetCode514_DynamicProgrammingProblem514();
        assert solver.solve(5) == 8;
        System.out.println("✅ LeetCode514_DynamicProgrammingProblem514 Passed!");
    }
}
