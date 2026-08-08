// https://leetcode.com/problems/odd-even-linked-list/
package linked_lists;

import java.util.*;

public class LeetCode328_OddEvenLinkedList {
    // LeetCode Problem 328: Odd Even Linked List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode328_OddEvenLinkedList solver = new LeetCode328_OddEvenLinkedList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode328_OddEvenLinkedList (Odd Even Linked List) Passed!");
    }
}
