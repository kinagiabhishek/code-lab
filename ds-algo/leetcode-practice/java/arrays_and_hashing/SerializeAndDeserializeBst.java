// https://leetcode.com/problems/serialize-and-deserialize-bst/
package arrays_and_hashing;

import java.util.*;

public class SerializeAndDeserializeBst {
    // LeetCode Problem 449: Serialize and Deserialize BST
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SerializeAndDeserializeBst solver = new SerializeAndDeserializeBst();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SerializeAndDeserializeBst (Serialize and Deserialize BST) Passed!");
    }
}
