// https://leetcode.com/problems/problem-stack-166/
package stacks_and_queues;

import java.util.*;

public class LeetCode166_StackProblem166 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode166_StackProblem166 solver = new LeetCode166_StackProblem166();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode166_StackProblem166 Passed!");
    }
}
