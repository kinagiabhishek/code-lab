// https://leetcode.com/problems/problem-stack-169/
package stacks_and_queues;

import java.util.*;

public class LeetCode169_StackProblem169 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode169_StackProblem169 solver = new LeetCode169_StackProblem169();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode169_StackProblem169 Passed!");
    }
}
