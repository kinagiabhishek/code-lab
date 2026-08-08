// https://leetcode.com/problems/sliding-window-maximum/
package sliding_window;
import java.util.*;
public class LeetCode239_SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length; int[] r = new int[n - k + 1]; int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!q.isEmpty() && q.peek() < i - k + 1) q.poll();
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) q.pollLast();
            q.offer(i);
            if (i >= k - 1) r[ri++] = nums[q.peek()];
        }
        return r;
    }
    public static void main(String[] args) {
        assert Arrays.equals(new LeetCode239_SlidingWindowMaximum().maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3), new int[]{3,3,5,5,6,7});
        System.out.println("✅ LeetCode239_SlidingWindowMaximum Passed!");
    }
}
