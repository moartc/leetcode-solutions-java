package solutions.algorithms._0_999._706_Design_HashMap;


class MyHashMap {
    /*
        I can use the index of an array as a key
        I'm tracking whether the element is present in a separate array - that way I don't have to fill the array
        with default values.
     */
    boolean[] hasValue;
    int[] arr;

    public MyHashMap() {
        int max = (int) (Math.pow(10, 6) + 1);
        arr = new int[max];
        hasValue = new boolean[max];
    }

    public void put(int key, int value) {
        hasValue[key] = true;
        arr[key] = value;
    }

    public int get(int key) {
        if (!hasValue[key]) {
            return -1;
        } else {
            return arr[key];
        }
    }

    public void remove(int key) {
        hasValue[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */