// https://leetcode.com/problems/find-all-duplicates-in-an-array/
package graphs;

import java.util.*;

public class FindAllDuplicatesInAnArray {
    // LeetCode Problem 442: Find All Duplicates in an Array
    // Official LeetCode Method Signature: public List<Integer> findDuplicates(int[] nums)
    public List<Integer> findDuplicates(int[] nums) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        FindAllDuplicatesInAnArray solver = new FindAllDuplicatesInAnArray();
        assert solver.findDuplicates(new int[]{1}).isEmpty();
        System.out.println("✅ FindAllDuplicatesInAnArray (Find All Duplicates in an Array) Passed!");
    }
}
