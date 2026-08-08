// https://leetcode.com/problems/problem-dp-510/
package dynamic_programming;

import java.util.*;

public class LeetCode510_DynamicProgrammingProblem510 {
    public int solve(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
    public static void main(String[] args) {
        LeetCode510_DynamicProgrammingProblem510 solver = new LeetCode510_DynamicProgrammingProblem510();
        assert solver.solve(5) == 8;
        System.out.println("✅ LeetCode510_DynamicProgrammingProblem510 Passed!");
    }
}
