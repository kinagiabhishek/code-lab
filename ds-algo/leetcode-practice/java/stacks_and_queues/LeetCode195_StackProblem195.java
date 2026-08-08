// https://leetcode.com/problems/problem-stack-195/
package stacks_and_queues;

import java.util.*;

public class LeetCode195_StackProblem195 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode195_StackProblem195 solver = new LeetCode195_StackProblem195();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode195_StackProblem195 Passed!");
    }
}
