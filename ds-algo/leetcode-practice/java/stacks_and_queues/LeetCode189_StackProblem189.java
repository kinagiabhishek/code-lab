// https://leetcode.com/problems/problem-stack-189/
package stacks_and_queues;

import java.util.*;

public class LeetCode189_StackProblem189 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode189_StackProblem189 solver = new LeetCode189_StackProblem189();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode189_StackProblem189 Passed!");
    }
}
