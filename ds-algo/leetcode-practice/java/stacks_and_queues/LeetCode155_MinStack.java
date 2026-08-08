// https://leetcode.com/problems/min-stack/
package stacks_and_queues;
import java.util.Stack;
public class LeetCode155_MinStack {
    private Stack<Integer> s = new Stack<>(), minS = new Stack<>();
    public void push(int val) { s.push(val); if (minS.isEmpty() || val <= minS.peek()) minS.push(val); }
    public void pop() { if (s.peek().equals(minS.peek())) minS.pop(); s.pop(); }
    public int top() { return s.peek(); }
    public int getMin() { return minS.peek(); }
    public static void main(String[] args) {
        LeetCode155_MinStack ms = new LeetCode155_MinStack(); ms.push(-2); ms.push(0); ms.push(-3);
        assert ms.getMin() == -3; ms.pop(); assert ms.top() == 0;
        System.out.println("✅ LeetCode155_MinStack Passed!");
    }
}
