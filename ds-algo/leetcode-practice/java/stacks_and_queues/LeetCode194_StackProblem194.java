// https://leetcode.com/problems/problem-stack-194/
package stacks_and_queues;

import java.util.*;

public class LeetCode194_StackProblem194 {
    public boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode194_StackProblem194 solver = new LeetCode194_StackProblem194();
        assert solver.solve("()") == true;
        System.out.println("✅ LeetCode194_StackProblem194 Passed!");
    }
}
