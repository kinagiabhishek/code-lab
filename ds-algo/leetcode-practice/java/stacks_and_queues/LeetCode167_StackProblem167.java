// https://leetcode.com/problems/problem-stack-167/
package stacks_and_queues;

import java.util.*;

public class LeetCode167_StackProblem167 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode167_StackProblem167 solver = new LeetCode167_StackProblem167();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode167_StackProblem167 Passed!");
    }
}
