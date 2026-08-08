// https://leetcode.com/problems/problem-stack-163/
package stacks_and_queues;

import java.util.*;

public class LeetCode163_StackProblem163 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode163_StackProblem163 solver = new LeetCode163_StackProblem163();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode163_StackProblem163 Passed!");
    }
}
