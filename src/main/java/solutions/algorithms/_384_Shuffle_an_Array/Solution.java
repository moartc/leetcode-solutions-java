package solutions.algorithms._384_Shuffle_an_Array;

import java.util.*;

class Solution {

    int[] array;
    List<Integer> original;
    Set<Integer> used;

    public Solution(int[] nums) {
        array = nums;
        original = Arrays.stream(array).boxed().toList();
        used = new HashSet<>(original.size());
    }

    public int[] reset() {
        int index = 0;
        for (int i : original) {
            array[index++] = i;
        }
        return array;
    }

    public int[] shuffle() {
        Random random = new Random();
        used.clear();
        for (int i = 0; i < array.length; i++) {
            int foundIndex;
            do {
                foundIndex = random.nextInt(array.length);
            } while (used.contains(foundIndex));
            used.add(foundIndex);
            array[i] = original.get(foundIndex);
        }
        return array;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */