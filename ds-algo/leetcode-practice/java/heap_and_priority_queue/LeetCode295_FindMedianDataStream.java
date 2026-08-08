// https://leetcode.com/problems/find-median-from-data-stream/
package heap_and_priority_queue;
import java.util.*;
public class LeetCode295_FindMedianDataStream {
    public static class MedianFinder {
        private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        public void addNum(int num) {
            maxHeap.add(num); minHeap.add(maxHeap.poll());
            if (maxHeap.size() < minHeap.size()) maxHeap.add(minHeap.poll());
        }
        public double findMedian() {
            return maxHeap.size() > minHeap.size() ? maxHeap.peek() : (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder(); mf.addNum(1); mf.addNum(2);
        assert mf.findMedian() == 1.5;
        System.out.println("✅ LeetCode295_FindMedianDataStream Passed!");
    }
}
