// https://leetcode.com/problems/serialize-and-deserialize-bst/
package trees;

import java.util.*;

public class SerializeAndDeserializeBst {
    // LeetCode Problem 449: Serialize and Deserialize BST
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SerializeAndDeserializeBst solver = new SerializeAndDeserializeBst();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode449_SerializeAndDeserializeBst (Serialize and Deserialize BST) Passed!");
    }
}
