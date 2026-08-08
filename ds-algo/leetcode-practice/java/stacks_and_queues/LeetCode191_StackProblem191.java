// https://leetcode.com/problems/problem-stack-191/
package stacks_and_queues;

import java.util.*;

public class LeetCode191_StackProblem191 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode191_StackProblem191 solver = new LeetCode191_StackProblem191();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode191_StackProblem191 Passed!");
    }
}
