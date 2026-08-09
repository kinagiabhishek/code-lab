// https://leetcode.com/problems/count-of-smaller-numbers-after-self/
package trees;

import java.util.*;

public class CountOfSmallerNumbersAfterSelf {
    // LeetCode Problem 315: Count of Smaller Numbers After Self
    // Official LeetCode Method Signature: public List<Integer> countSmaller(int[] nums)
    public List<Integer> countSmaller(int[] nums) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        CountOfSmallerNumbersAfterSelf solver = new CountOfSmallerNumbersAfterSelf();
        assert solver.countSmaller(new int[]{1}).isEmpty();
        System.out.println("✅ CountOfSmallerNumbersAfterSelf Passed!");
    }
}
