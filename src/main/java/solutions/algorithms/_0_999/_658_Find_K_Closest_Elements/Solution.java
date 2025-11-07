package solutions.algorithms._0_999._658_Find_K_Closest_Elements;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    I iterate through the array and keep track of all k values (when I have them all).
    Each time I check if any of them can be replaced.
    Once I start finding values with greater distances, I can stop, since that means I won't improve the result.

    update:
    performance is pretty bad - beats 22.5%
    I could actually try to find the closest element in O(log n) time using something like binary search
    then expand outward from that index in both directions, adding elements until I reach k.

    not the fastest, but at least beats ~50%
     */
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int bestIdx = findTheBestIdx(arr, x);

        int l = bestIdx;
        int r = bestIdx;
        while (r - l + 1 < k) {
            if (l - 1 >= 0 && r + 1 < arr.length) {
                int rV = arr[r + 1];
                int lV = arr[l - 1];
                if (Math.abs(rV - x) < Math.abs(lV - x)) {
                    r++;
                } else {
                    l--;
                }
            } else if (l > 0) {
                l--;
            } else {
                r++;
            }
        }
        List<Integer> res = new ArrayList<>(k);
        for (int i = l; i <= r; i++) {
            res.add(arr[i]);
        }
        return res;
    }

    int findTheBestIdx(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (r - l == 1) {
                int lD = Math.abs(arr[l] - x);
                int rD = Math.abs(arr[r] - x);
                if (lD <= rD) {
                    return l;
                } else {
                    return r;
                }
            }
            int middle = (r + l) / 2;
            if (x > arr[middle]) {
                l = middle;

            } else {
                r = middle;
            }
        }
        return l;
    }
}
