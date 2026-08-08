// https://leetcode.com/problems/problem-stack-173/
package stacks_and_queues;

import java.util.*;

public class LeetCode173_StackProblem173 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode173_StackProblem173 solver = new LeetCode173_StackProblem173();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode173_StackProblem173 Passed!");
    }
}
