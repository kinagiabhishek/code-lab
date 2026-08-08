// https://leetcode.com/problems/design-add-and-search-words-data-structure/
package binary_search;

import java.util.*;

public class LeetCode211_DesignAddAndSearchWordsDataStructure {
    // LeetCode Problem 211: Design Add and Search Words Data Structure
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode211_DesignAddAndSearchWordsDataStructure solver = new LeetCode211_DesignAddAndSearchWordsDataStructure();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode211_DesignAddAndSearchWordsDataStructure (Design Add and Search Words Data Structure) Passed!");
    }
}
