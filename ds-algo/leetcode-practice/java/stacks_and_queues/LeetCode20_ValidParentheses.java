// https://leetcode.com/problems/valid-parentheses/
package stacks_and_queues;
import java.util.Stack;

public class LeetCode20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        LeetCode20_ValidParentheses solver = new LeetCode20_ValidParentheses();
        assert solver.isValid("()[]{}") == true;
        assert solver.isValid("(]") == false;
        System.out.println("✅ LeetCode20_ValidParentheses Passed!");
    }
}
