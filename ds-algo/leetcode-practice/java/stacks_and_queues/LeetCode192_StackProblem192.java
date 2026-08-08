// https://leetcode.com/problems/problem-stack-192/
package stacks_and_queues;

import java.util.*;

public class LeetCode192_StackProblem192 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode192_StackProblem192 solver = new LeetCode192_StackProblem192();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode192_StackProblem192 Passed!");
    }
}
