// https://leetcode.com/problems/problem-stack-181/
package stacks_and_queues;

import java.util.*;

public class LeetCode181_StackProblem181 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode181_StackProblem181 solver = new LeetCode181_StackProblem181();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode181_StackProblem181 Passed!");
    }
}
