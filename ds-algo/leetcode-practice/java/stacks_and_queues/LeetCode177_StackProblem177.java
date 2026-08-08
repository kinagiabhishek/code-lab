// https://leetcode.com/problems/problem-stack-177/
package stacks_and_queues;

import java.util.*;

public class LeetCode177_StackProblem177 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode177_StackProblem177 solver = new LeetCode177_StackProblem177();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode177_StackProblem177 Passed!");
    }
}
