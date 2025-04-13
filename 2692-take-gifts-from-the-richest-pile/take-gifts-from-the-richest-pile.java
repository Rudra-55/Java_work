import java.util.*;

public class Solution {
    public long pickGifts(int[] gifts, int k) {
        // Max-heap using reverse order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all piles to the heap
        for (int gift : gifts) {
            maxHeap.offer(gift);
        }

        // Perform k operations
        for (int i = 0; i < k; i++) {
            if (!maxHeap.isEmpty()) {
                int max = maxHeap.poll();
                int reduced = (int) Math.floor(Math.sqrt(max));
                maxHeap.offer(reduced);
            }
        }

        // Sum the remaining gifts
        long total = 0;
        while (!maxHeap.isEmpty()) {
            total += maxHeap.poll();
        }

        return total;
    }
}