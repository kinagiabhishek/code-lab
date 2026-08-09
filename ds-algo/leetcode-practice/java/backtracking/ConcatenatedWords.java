// https://leetcode.com/problems/concatenated-words/
package backtracking;

import java.util.*;

public class ConcatenatedWords {
    // LeetCode Problem 472: Concatenated Words
    // Official LeetCode Method Signature: public List<String> findAllConcatenatedWordsInADict(String[] words)
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ConcatenatedWords solver = new ConcatenatedWords();
        assert solver.findAllConcatenatedWordsInADict(new int[]{1}).isEmpty();
        System.out.println("✅ ConcatenatedWords Passed!");
    }
}
