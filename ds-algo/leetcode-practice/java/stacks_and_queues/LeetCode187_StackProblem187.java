// https://leetcode.com/problems/problem-stack-187/
package stacks_and_queues;

import java.util.*;

public class LeetCode187_StackProblem187 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode187_StackProblem187 solver = new LeetCode187_StackProblem187();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode187_StackProblem187 Passed!");
    }
}
