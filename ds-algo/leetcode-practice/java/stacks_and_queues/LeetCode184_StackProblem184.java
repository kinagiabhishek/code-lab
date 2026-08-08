// https://leetcode.com/problems/problem-stack-184/
package stacks_and_queues;

import java.util.*;

public class LeetCode184_StackProblem184 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode184_StackProblem184 solver = new LeetCode184_StackProblem184();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode184_StackProblem184 Passed!");
    }
}
