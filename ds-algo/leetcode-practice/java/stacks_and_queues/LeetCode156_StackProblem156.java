// https://leetcode.com/problems/problem-stack-156/
package stacks_and_queues;

import java.util.*;

public class LeetCode156_StackProblem156 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode156_StackProblem156 solver = new LeetCode156_StackProblem156();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode156_StackProblem156 Passed!");
    }
}
