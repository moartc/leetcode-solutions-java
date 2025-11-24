package solutions.algorithms._0_999._460_LFU_Cache;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

class LFUCache {

    /*
    When I get a key, I should be able to check in O(1) if it exists in the cache, and if so, return it
    I also need to update its counter - either set it to 1 or increment it. For that I can maintain a map key -> ctr

    In put, I should be able to add a new key or update an existing one and increment its counter
    (using the same map as above)

    when I put, I check the current counter (map above), get the list of keys -> for that I can maintain a linked set since I need O(1)

    I also need a third map: key -> val to store the actual value for each key

    beats 44%, not the best but at least it works correctly
     */

    int capacity;
    Map<Integer, Integer> keyToValue;
    Map<Integer, Integer> keyToCounter;
    Map<Integer, LinkedHashSet<Integer>> counterToKeys;
    int lowestCtr;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.keyToValue = new HashMap<>();
        this.keyToCounter = new HashMap<>();
        this.counterToKeys = new HashMap<>();
        this.lowestCtr = Integer.MAX_VALUE;
    }

    public int get(int key) {
        Integer val = keyToValue.get(key);
        if (val != null) {
            // this cannot be null here
            Integer currentCounter = keyToCounter.get(key);
            keyToCounter.put(key, currentCounter + 1);
            LinkedHashSet<Integer> prevCounterSet = counterToKeys.get(currentCounter);
            prevCounterSet.remove(key);
            if (prevCounterSet.isEmpty() && currentCounter == lowestCtr) {
                // previous element was the only one with the lowest counter, increment it
                lowestCtr++;
            }
            counterToKeys.put(currentCounter, prevCounterSet);
            // this might be null
            LinkedHashSet<Integer> newCounterSet = counterToKeys.get(currentCounter + 1);
            if (newCounterSet == null) {
                newCounterSet = new LinkedHashSet<>();
            }
            newCounterSet.add(key);
            counterToKeys.put(currentCounter + 1, newCounterSet);
            return val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        Integer val = keyToValue.get(key);
        if (val == null) {
            // not added yet - so check if I can add a new element
            int currentSize = keyToValue.size();
            if (currentSize == capacity) {
                // limit reached
                LinkedHashSet<Integer> setForLowestCtr = counterToKeys.get(lowestCtr);
                Integer keyToRemove = setForLowestCtr.iterator().next();
                setForLowestCtr.remove(keyToRemove);
                counterToKeys.put(lowestCtr, setForLowestCtr);
                // I don't care about the lowestCtr because the new element will get one
                keyToValue.remove(keyToRemove);
                keyToCounter.remove(keyToRemove);
                // now I can add my new element
            }
            // removal, if needed handled above - I can add a new value
            keyToValue.put(key, value);
            keyToCounter.put(key, 1);
            lowestCtr = 1;
            LinkedHashSet<Integer> ctrSet = counterToKeys.get(1);
            if (ctrSet == null) {
                ctrSet = new LinkedHashSet<>();
            }
            ctrSet.add(key);
            counterToKeys.put(1, ctrSet);
        } else {
            // value exists
            keyToValue.put(key, value);
            Integer currentCtr = keyToCounter.get(key);
            keyToCounter.put(key, currentCtr + 1);

            LinkedHashSet<Integer> prevCounterSet = counterToKeys.get(currentCtr);
            prevCounterSet.remove(key);
            if (prevCounterSet.isEmpty() && currentCtr == lowestCtr) {
                // previous element was the only one with the lowest counter, increment it
                lowestCtr++;
            }
            counterToKeys.put(currentCtr, prevCounterSet);
            // this might be null
            LinkedHashSet<Integer> newCounterSet = counterToKeys.get(currentCtr + 1);
            if (newCounterSet == null) {
                newCounterSet = new LinkedHashSet<>();
            }
            newCounterSet.add(key);
            counterToKeys.put(currentCtr + 1, newCounterSet);
        }
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */