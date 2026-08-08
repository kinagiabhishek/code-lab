// https://leetcode.com/problems/problem-stack-160/
package stacks_and_queues;

import java.util.*;

public class LeetCode160_StackProblem160 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode160_StackProblem160 solver = new LeetCode160_StackProblem160();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode160_StackProblem160 Passed!");
    }
}
