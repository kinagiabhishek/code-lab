// https://leetcode.com/problems/daily-temperatures/
package stacks_and_queues;
import java.util.*;
public class LeetCode739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length; int[] res = new int[n]; Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                int prev = s.pop(); res[prev] = i - prev;
            }
            s.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        assert Arrays.equals(new LeetCode739_DailyTemperatures().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}), new int[]{1, 1, 4, 2, 1, 1, 0, 0});
        System.out.println("✅ LeetCode739_DailyTemperatures Passed!");
    }
}
