package solutions.algorithms._0_999._705_Design_HashSet;

class MyHashSet {

    /*
    Keys are 0 <= key <= 10^6, so I could create a boolean array that can track all these values
     */

    boolean[] arr;

    public MyHashSet() {
        int max = (int) (Math.pow(10, 6) + 1);
        arr = new boolean[max];
    }

    public void add(int key) {
        arr[key] = true;
    }

    public void remove(int key) {
        arr[key] = false;
    }

    public boolean contains(int key) {
        return arr[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */