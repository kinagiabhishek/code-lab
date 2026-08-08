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
        assert new LeetCode20_ValidParentheses().isValid("()[]{}") == true;
        System.out.println("✅ LeetCode20_ValidParentheses Passed!");
    }
}
