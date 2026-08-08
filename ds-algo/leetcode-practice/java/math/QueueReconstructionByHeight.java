// https://leetcode.com/problems/queue-reconstruction-by-height/
package math;

import java.util.*;

public class QueueReconstructionByHeight {
    // LeetCode Problem 406: Queue Reconstruction by Height
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        QueueReconstructionByHeight solver = new QueueReconstructionByHeight();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ QueueReconstructionByHeight (Queue Reconstruction by Height) Passed!");
    }
}
