// https://leetcode.com/problems/problem-stack-157/
package stacks_and_queues;

import java.util.*;

public class LeetCode157_StackProblem157 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode157_StackProblem157 solver = new LeetCode157_StackProblem157();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode157_StackProblem157 Passed!");
    }
}
