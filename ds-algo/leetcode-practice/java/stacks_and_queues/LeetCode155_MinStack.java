package stacks_and_queues;
import java.util.Stack;

public class LeetCode155_MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
    public int top() { return stack.peek(); }
    public int getMin() { return minStack.peek(); }

    public static void main(String[] args) {
        LeetCode155_MinStack minStack = new LeetCode155_MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assert minStack.getMin() == -3;
        minStack.pop();
        assert minStack.top() == 0;
        assert minStack.getMin() == -2;
        System.out.println("✅ LeetCode155_MinStack Passed!");
    }
}
