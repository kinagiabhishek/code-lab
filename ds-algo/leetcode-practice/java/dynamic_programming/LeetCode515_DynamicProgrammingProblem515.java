// https://leetcode.com/problems/problem-dp-515/
package dynamic_programming;

import java.util.*;

public class LeetCode515_DynamicProgrammingProblem515 {
    public int solve(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
    public static void main(String[] args) {
        LeetCode515_DynamicProgrammingProblem515 solver = new LeetCode515_DynamicProgrammingProblem515();
        assert solver.solve(5) == 8;
        System.out.println("✅ LeetCode515_DynamicProgrammingProblem515 Passed!");
    }
}
