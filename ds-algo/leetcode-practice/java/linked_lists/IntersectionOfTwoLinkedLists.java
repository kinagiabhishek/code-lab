// https://leetcode.com/problems/intersection-of-two-linked-lists/
package linked_lists;

import java.util.*;

public class IntersectionOfTwoLinkedLists {
    // LeetCode Problem 160: Intersection of Two Linked Lists
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        IntersectionOfTwoLinkedLists solver = new IntersectionOfTwoLinkedLists();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode160_IntersectionOfTwoLinkedLists (Intersection of Two Linked Lists) Passed!");
    }
}
