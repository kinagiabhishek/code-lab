// https://leetcode.com/problems/problem-stack-183/
package stacks_and_queues;

import java.util.*;

public class LeetCode183_StackProblem183 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode183_StackProblem183 solver = new LeetCode183_StackProblem183();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode183_StackProblem183 Passed!");
    }
}
