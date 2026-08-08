// https://leetcode.com/problems/problem-stack-198/
package stacks_and_queues;

import java.util.*;

public class LeetCode198_StackProblem198 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode198_StackProblem198 solver = new LeetCode198_StackProblem198();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode198_StackProblem198 Passed!");
    }
}
