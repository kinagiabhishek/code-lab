// https://leetcode.com/problems/problem-dp-506/
package dynamic_programming;

import java.util.*;

public class LeetCode506_DynamicProgrammingProblem506 {
    public int solve(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
    public static void main(String[] args) {
        LeetCode506_DynamicProgrammingProblem506 solver = new LeetCode506_DynamicProgrammingProblem506();
        assert solver.solve(5) == 8;
        System.out.println("✅ LeetCode506_DynamicProgrammingProblem506 Passed!");
    }
}
