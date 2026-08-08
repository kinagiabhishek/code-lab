// https://leetcode.com/problems/lru-cache/
package linked_lists;
import java.util.*;
public class LeetCode146_LRUCache {
    static class LRUCache {
        int capacity;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        public LRUCache(int capacity) { this.capacity = capacity; }
        public int get(int key) {
            if (!map.containsKey(key)) return -1;
            int val = map.remove(key); map.put(key, val); return val;
        }
        public void put(int key, int value) {
            if (map.containsKey(key)) map.remove(key);
            else if (map.size() == capacity) {
                int firstKey = map.keySet().iterator().next(); map.remove(firstKey);
            }
            map.put(key, value);
        }
    }
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2); cache.put(1, 1); cache.put(2, 2);
        assert cache.get(1) == 1; cache.put(3, 3); assert cache.get(2) == -1;
        System.out.println("✅ LeetCode146_LRUCache Passed!");
    }
}
