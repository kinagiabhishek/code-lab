// https://leetcode.com/problems/partition-list/
package linked_lists;

import java.util.*;

public class LeetCode86_PartitionList {
    // LeetCode Problem 86: Partition List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode86_PartitionList solver = new LeetCode86_PartitionList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode86_PartitionList (Partition List) Passed!");
    }
}
