package solutions.algorithms._1000_1999._1352_Product_of_the_Last_K_Numbers;

import java.util.LinkedList;

class ProductOfNumbers {

    LinkedList<Integer> list;

    public ProductOfNumbers() {
        list = new LinkedList<>();
    }

    public void add(int num) {
        if (list.isEmpty() && num != 0) {
            list.add(num);
        } else if (num == 0) {
            list.clear();
        } else {
            list.add(list.getLast() * num);
        }
    }

    public int getProduct(int k) {
        if (list.size() < k) {
            return 0;
        } else {
            int totalSize = list.size();
            int lastIdxBefore = totalSize - k - 1;
            int lastVal = list.getLast();
            if (lastIdxBefore != -1) {
                return lastVal / list.get(lastIdxBefore);
            } else {
                return lastVal;
            }
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */