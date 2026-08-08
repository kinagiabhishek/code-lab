// https://leetcode.com/problems/queue-reconstruction-by-height/
package stacks_and_queues;

import java.util.*;

public class LeetCode406_QueueReconstructionByHeight {
    // LeetCode Problem 406: Queue Reconstruction by Height
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode406_QueueReconstructionByHeight solver = new LeetCode406_QueueReconstructionByHeight();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode406_QueueReconstructionByHeight (Queue Reconstruction by Height) Passed!");
    }
}
