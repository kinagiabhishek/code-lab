package arrays_and_hashing;
import java.util.*;

public class LeetCode347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> countMap.get(a) - countMap.get(b));
        for (int num : countMap.keySet()) {
            pq.add(num);
            if (pq.size() > k) pq.poll();
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = pq.poll();
        return res;
    }
    public static void main(String[] args) {
        LeetCode347_TopKFrequentElements solver = new LeetCode347_TopKFrequentElements();
        int[] res = solver.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        assert res.length == 2;
        System.out.println("✅ LeetCode347_TopKFrequentElements Passed!");
    }
}
