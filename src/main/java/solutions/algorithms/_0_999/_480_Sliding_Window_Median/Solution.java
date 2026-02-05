package solutions.algorithms._0_999._480_Sliding_Window_Median;

import java.util.Map;
import java.util.TreeMap;

class Solution {

    /*
    if k is odd - I should track only one value
    if k is even - I need 2 values and take the mean of those 2
    I could use 2 heaps for that:
    - if arr size is even they should have equal sizes, otherwise one 1 larger by 1 (let's say maxHeap)
    - one is a max heap, the other a min heap
    the only problem is that I cannot efficiently remove the value that leaves the window from a heap.
    But since I know which heap it is in, I can mark it as 'deleted', and track that the heap is
    larger by 1 because of that. When I eventually poll this value , I delete (simply ignore) it and poll the next one.
    ----------------------
    update: I couldn't solve it in 2 days. It turned out to be harder to implement than I expected and in the end
    I got a TLE on one test case.

    I'm switching to a TreeSet - so I can delete element (relatively fast) and the implementation should be much simpler.
    update: ok, finally it somehow works, beats 33.18%
     */
    public double[] medianSlidingWindow(int[] nums, int k) {

        // lower half / the highest at the end, compare with the end
        TreeMap<Integer, Integer> min = new TreeMap<>();
        // higher half / the lowest at the beginning, compare with the beginning
        TreeMap<Integer, Integer> max = new TreeMap<>();

        int minCtr = 0;
        int maxCtr = 0;

        double[] res = new double[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            int toAdd = nums[i];
            // add it here, then I will rebalance
            if (i < k) {
                add(min, toAdd);
                minCtr++;
            } else { // here I have a full window
                int toDelete = nums[i - k];
                if (!min.isEmpty() && toDelete <= min.lastKey()) {
                    delete(min, toDelete);
                    minCtr--;
                } else {
                    // delete from max
                    delete(max, toDelete);
                    maxCtr--;
                }
                // adding part
                // if it's greater than the lowest in bigger half
                if (max.isEmpty() || toAdd >= max.firstKey()) {
                    add(max, toAdd);
                    maxCtr++;
                } else {
                    add(min, toAdd);
                    minCtr++;
                }
            }
            if (i >= k - 1) {
                // rabalance part
                while (maxCtr > minCtr + 1) {
                    Map.Entry<Integer, Integer> entry = max.firstEntry();
                    if (entry == null) {
                        break;
                    }
                    add(min, entry.getKey());
                    delete(max, entry.getKey());
                    maxCtr--;
                    minCtr++;
                }
                while (minCtr > maxCtr) {
                    Map.Entry<Integer, Integer> entry = min.lastEntry();
                    if (entry == null) {
                        break;
                    }
                    add(max, entry.getKey());
                    delete(min, entry.getKey());
                    minCtr--;
                    maxCtr++;
                }
                // avg
                if (k % 2 == 0) {
                    Integer v1 = min.lastKey();
                    Integer v2 = max.firstKey();
                    double avg = v1 / 2.0 + v2 / 2.0;
                    res[i - k + 1] = avg;
                } else {
                    int v = max.firstKey();
                    res[i - k + 1] = v;
                }
            }
        }
        // 1 1 3 4
        // 5 7 8
        return res;
    }

    void delete(TreeMap<Integer, Integer> map, int toDelete) {
        Integer i = map.get(toDelete);
        if (i != null && i > 1) {
            map.put(toDelete, i - 1);
        } else {
            map.remove(toDelete);
        }
    }

    void add(TreeMap<Integer, Integer> map, int toAdd) {
        if (map.containsKey(toAdd)) {
            Integer current = map.get(toAdd);
            map.put(toAdd, current + 1);
        } else {
            map.put(toAdd, 1);
        }
    }
}