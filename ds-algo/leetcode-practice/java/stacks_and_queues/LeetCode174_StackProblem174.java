// https://leetcode.com/problems/problem-stack-174/
package stacks_and_queues;

import java.util.*;

public class LeetCode174_StackProblem174 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode174_StackProblem174 solver = new LeetCode174_StackProblem174();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode174_StackProblem174 Passed!");
    }
}
