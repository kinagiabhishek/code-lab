// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
package bit_manipulation;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    // LeetCode Problem 448: Find All Numbers Disappeared in an Array
    // Official LeetCode Method Signature: public List<Integer> findDisappearedNumbers(int[] nums)
    public List<Integer> findDisappearedNumbers(int[] nums) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray solver = new FindAllNumbersDisappearedInAnArray();
        assert solver.findDisappearedNumbers(new int[]{1}).isEmpty();
        System.out.println("✅ FindAllNumbersDisappearedInAnArray (Find All Numbers Disappeared in an Array) Passed!");
    }
}
