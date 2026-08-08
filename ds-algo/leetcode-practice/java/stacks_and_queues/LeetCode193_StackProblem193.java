// https://leetcode.com/problems/problem-stack-193/
package stacks_and_queues;

import java.util.*;

public class LeetCode193_StackProblem193 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode193_StackProblem193 solver = new LeetCode193_StackProblem193();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode193_StackProblem193 Passed!");
    }
}
