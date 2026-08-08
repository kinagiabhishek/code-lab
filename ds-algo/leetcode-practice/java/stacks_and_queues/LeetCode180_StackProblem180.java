// https://leetcode.com/problems/problem-stack-180/
package stacks_and_queues;

import java.util.*;

public class LeetCode180_StackProblem180 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode180_StackProblem180 solver = new LeetCode180_StackProblem180();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode180_StackProblem180 Passed!");
    }
}
