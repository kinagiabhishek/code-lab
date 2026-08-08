// https://leetcode.com/problems/group-anagrams/
package arrays_and_hashing;

import java.util.*;

public class GroupAnagrams {
public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray(); Arrays.sort(ca);
            String key = String.valueOf(ca);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        GroupAnagrams solver = new GroupAnagrams();
        assert solver.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).size() == 3;
        System.out.println("✅ GroupAnagrams Passed!");
    }
}
