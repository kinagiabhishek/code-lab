// https://leetcode.com/problems/problem-stack-165/
package stacks_and_queues;

import java.util.*;

public class LeetCode165_StackProblem165 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode165_StackProblem165 solver = new LeetCode165_StackProblem165();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode165_StackProblem165 Passed!");
    }
}
