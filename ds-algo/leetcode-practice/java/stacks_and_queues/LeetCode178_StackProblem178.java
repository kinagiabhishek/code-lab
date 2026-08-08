// https://leetcode.com/problems/problem-stack-178/
package stacks_and_queues;

import java.util.*;

public class LeetCode178_StackProblem178 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode178_StackProblem178 solver = new LeetCode178_StackProblem178();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode178_StackProblem178 Passed!");
    }
}
