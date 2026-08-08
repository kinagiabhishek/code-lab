// https://leetcode.com/problems/problem-stack-170/
package stacks_and_queues;

import java.util.*;

public class LeetCode170_StackProblem170 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode170_StackProblem170 solver = new LeetCode170_StackProblem170();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode170_StackProblem170 Passed!");
    }
}
