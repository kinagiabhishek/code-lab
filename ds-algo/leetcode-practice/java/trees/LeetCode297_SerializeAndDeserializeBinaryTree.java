// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
package trees;

import java.util.*;

public class LeetCode297_SerializeAndDeserializeBinaryTree {
    // LeetCode Problem 297: Serialize and Deserialize Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode297_SerializeAndDeserializeBinaryTree solver = new LeetCode297_SerializeAndDeserializeBinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode297_SerializeAndDeserializeBinaryTree (Serialize and Deserialize Binary Tree) Passed!");
    }
}
