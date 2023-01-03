package solutions.algorithms._706_Design_HashMap;

import java.util.LinkedList;
import java.util.List;

class MyHashMap {

    private final List<KeyValue>[] arr;

    public MyHashMap() {
        // randomly chosen size
        arr = new List[1000];
    }

    public void put(int key, int value) {
        int idx = key % 1000;
        if (arr[idx] == null) {
            arr[idx] = new LinkedList<>();
        } else {
            remove(key);
        }
        arr[idx].add(new KeyValue(key, value));
    }

    public int get(int key) {
        int idx = key % 1000;
        List<KeyValue> list = arr[idx];
        if (list == null) {
            return -1;
        } else {
            for (KeyValue keyValue : list) {
                if (keyValue.key == key) {
                    return keyValue.value;
                }
            }
        }
        return -1;
    }

    public void remove(int key) {
        int idx = key % 1000;
        if(arr[idx] != null) {
            arr[idx].removeIf(k -> k.key == key);
        }
    }

    private static class KeyValue {

        private final int key;
        private final int value;

        public KeyValue(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */