// https://leetcode.com/problems/problem-dp-475/
package dynamic_programming;

import java.util.*;

public class LeetCode475_DynamicProgrammingProblem475 {
    public int solve(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
    public static void main(String[] args) {
        LeetCode475_DynamicProgrammingProblem475 solver = new LeetCode475_DynamicProgrammingProblem475();
        assert solver.solve(5) == 8;
        System.out.println("✅ LeetCode475_DynamicProgrammingProblem475 Passed!");
    }
}
