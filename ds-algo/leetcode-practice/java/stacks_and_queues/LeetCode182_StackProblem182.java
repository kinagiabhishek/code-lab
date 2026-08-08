// https://leetcode.com/problems/problem-stack-182/
package stacks_and_queues;

import java.util.*;

public class LeetCode182_StackProblem182 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode182_StackProblem182 solver = new LeetCode182_StackProblem182();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode182_StackProblem182 Passed!");
    }
}
