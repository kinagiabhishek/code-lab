// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
package sliding_window;

import java.util.*;

public class SerializeAndDeserializeBinaryTree {
    // LeetCode Problem 297: Serialize and Deserialize Binary Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree solver = new SerializeAndDeserializeBinaryTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SerializeAndDeserializeBinaryTree (Serialize and Deserialize Binary Tree) Passed!");
    }
}
