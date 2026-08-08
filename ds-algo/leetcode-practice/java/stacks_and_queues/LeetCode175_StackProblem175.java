// https://leetcode.com/problems/problem-stack-175/
package stacks_and_queues;

import java.util.*;

public class LeetCode175_StackProblem175 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode175_StackProblem175 solver = new LeetCode175_StackProblem175();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode175_StackProblem175 Passed!");
    }
}
