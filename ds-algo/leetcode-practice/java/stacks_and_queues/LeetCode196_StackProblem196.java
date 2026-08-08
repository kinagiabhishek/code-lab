// https://leetcode.com/problems/problem-stack-196/
package stacks_and_queues;

import java.util.*;

public class LeetCode196_StackProblem196 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode196_StackProblem196 solver = new LeetCode196_StackProblem196();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode196_StackProblem196 Passed!");
    }
}
