// https://leetcode.com/problems/problem-stack-161/
package stacks_and_queues;

import java.util.*;

public class LeetCode161_StackProblem161 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode161_StackProblem161 solver = new LeetCode161_StackProblem161();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode161_StackProblem161 Passed!");
    }
}
