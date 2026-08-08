// https://leetcode.com/problems/problem-stack-162/
package stacks_and_queues;

import java.util.*;

public class LeetCode162_StackProblem162 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode162_StackProblem162 solver = new LeetCode162_StackProblem162();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode162_StackProblem162 Passed!");
    }
}
