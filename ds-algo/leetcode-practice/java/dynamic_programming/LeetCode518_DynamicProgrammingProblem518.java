// https://leetcode.com/problems/problem-dp-518/
package dynamic_programming;

import java.util.*;

public class LeetCode518_DynamicProgrammingProblem518 {
    public int solve(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
    public static void main(String[] args) {
        LeetCode518_DynamicProgrammingProblem518 solver = new LeetCode518_DynamicProgrammingProblem518();
        assert solver.solve(5) == 8;
        System.out.println("✅ LeetCode518_DynamicProgrammingProblem518 Passed!");
    }
}
