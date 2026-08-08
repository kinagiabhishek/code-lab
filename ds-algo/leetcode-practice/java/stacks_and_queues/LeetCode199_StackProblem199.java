// https://leetcode.com/problems/problem-stack-199/
package stacks_and_queues;

import java.util.*;

public class LeetCode199_StackProblem199 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode199_StackProblem199 solver = new LeetCode199_StackProblem199();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode199_StackProblem199 Passed!");
    }
}
