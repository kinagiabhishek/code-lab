// https://leetcode.com/problems/problem-stack-190/
package stacks_and_queues;

import java.util.*;

public class LeetCode190_StackProblem190 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode190_StackProblem190 solver = new LeetCode190_StackProblem190();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode190_StackProblem190 Passed!");
    }
}
