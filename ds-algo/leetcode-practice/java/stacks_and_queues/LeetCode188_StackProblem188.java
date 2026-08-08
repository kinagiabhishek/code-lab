// https://leetcode.com/problems/problem-stack-188/
package stacks_and_queues;

import java.util.*;

public class LeetCode188_StackProblem188 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode188_StackProblem188 solver = new LeetCode188_StackProblem188();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode188_StackProblem188 Passed!");
    }
}
