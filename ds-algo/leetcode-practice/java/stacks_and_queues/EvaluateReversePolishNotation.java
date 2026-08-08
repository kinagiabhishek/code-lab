// https://leetcode.com/problems/evaluate-reverse-polish-notation/
package stacks_and_queues;
import java.util.Stack;
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens) {
            if (t.equals("+")) stack.push(stack.pop() + stack.pop());
            else if (t.equals("-")) { int b = stack.pop(), a = stack.pop(); stack.push(a - b); }
            else if (t.equals("*")) stack.push(stack.pop() * stack.pop());
            else if (t.equals("/")) { int b = stack.pop(), a = stack.pop(); stack.push(a / b); }
            else stack.push(Integer.parseInt(t));
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        assert new EvaluateReversePolishNotation().evalRPN(new String[]{"2","1","+","3","*"}) == 9;
        System.out.println("✅ LeetCode150_EvaluateReversePolishNotation Passed!");
    }
}
