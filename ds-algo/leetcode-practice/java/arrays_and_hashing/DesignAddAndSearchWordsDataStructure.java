// https://leetcode.com/problems/design-add-and-search-words-data-structure/
package arrays_and_hashing;

import java.util.*;

public class DesignAddAndSearchWordsDataStructure {
    // LeetCode Problem 211: Design Add and Search Words Data Structure
    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;
    }

    private final TrieNode root;

    public DesignAddAndSearchWordsDataStructure() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isWord = true;
    }
    
    public boolean search(String word) {
        return searchInNode(word, 0, root);
    }

    private boolean searchInNode(String word, int index, TrieNode node) {
        if (node == null) return false;
        if (index == word.length()) return node.isWord;

        char c = word.charAt(index);
        if (c == '.') {
            for (TrieNode child : node.children) {
                if (child != null && searchInNode(word, index + 1, child)) {
                    return true;
                }
            }
            return false;
        } else {
            int idx = c - 'a';
            return searchInNode(word, index + 1, node.children[idx]);
        }
    }

    public static void main(String[] args) {
        DesignAddAndSearchWordsDataStructure wordDictionary = new DesignAddAndSearchWordsDataStructure();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        assert wordDictionary.search("pad") == false;
        assert wordDictionary.search("bad") == true;
        assert wordDictionary.search(".ad") == true;
        assert wordDictionary.search("b..") == true;
        System.out.println("✅ DesignAddAndSearchWordsDataStructure Passed!");
    }
}
