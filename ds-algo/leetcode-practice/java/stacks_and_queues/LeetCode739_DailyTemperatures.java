// https://leetcode.com/problems/daily-temperatures/
package stacks_and_queues;
import java.util.Stack;
import java.util.Arrays;

public class LeetCode739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prev = stack.pop();
                res[prev] = i - prev;
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode739_DailyTemperatures solver = new LeetCode739_DailyTemperatures();
        int[] res = solver.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        assert Arrays.equals(res, new int[]{1, 1, 4, 2, 1, 1, 0, 0});
        System.out.println("✅ LeetCode739_DailyTemperatures Passed!");
    }
}
