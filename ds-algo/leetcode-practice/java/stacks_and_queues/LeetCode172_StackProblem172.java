// https://leetcode.com/problems/problem-stack-172/
package stacks_and_queues;

import java.util.*;

public class LeetCode172_StackProblem172 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode172_StackProblem172 solver = new LeetCode172_StackProblem172();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode172_StackProblem172 Passed!");
    }
}
