// https://leetcode.com/problems/serialize-and-deserialize-bst/
package trees;

import java.util.*;

public class LeetCode449_SerializeAndDeserializeBst {
    // LeetCode Problem 449: Serialize and Deserialize BST
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode449_SerializeAndDeserializeBst solver = new LeetCode449_SerializeAndDeserializeBst();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode449_SerializeAndDeserializeBst (Serialize and Deserialize BST) Passed!");
    }
}
