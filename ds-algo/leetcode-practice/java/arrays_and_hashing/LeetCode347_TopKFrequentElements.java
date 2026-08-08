// https://leetcode.com/problems/top-k-frequent-elements/
package arrays_and_hashing;
import java.util.*;
public class LeetCode347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int n : map.keySet()) { pq.add(n); if (pq.size() > k) pq.poll(); }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = pq.poll();
        return res;
    }
    public static void main(String[] args) {
        assert new LeetCode347_TopKFrequentElements().topKFrequent(new int[]{1,1,1,2,2,3}, 2).length == 2;
        System.out.println("✅ LeetCode347_TopKFrequentElements Passed!");
    }
}
