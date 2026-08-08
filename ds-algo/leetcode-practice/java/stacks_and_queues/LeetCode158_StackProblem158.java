// https://leetcode.com/problems/problem-stack-158/
package stacks_and_queues;

import java.util.*;

public class LeetCode158_StackProblem158 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode158_StackProblem158 solver = new LeetCode158_StackProblem158();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode158_StackProblem158 Passed!");
    }
}
