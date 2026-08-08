// https://leetcode.com/problems/problem-stack-168/
package stacks_and_queues;

import java.util.*;

public class LeetCode168_StackProblem168 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode168_StackProblem168 solver = new LeetCode168_StackProblem168();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode168_StackProblem168 Passed!");
    }
}
