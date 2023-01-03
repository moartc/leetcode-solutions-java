package solutions.algorithms._706_Design_HashMap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MyHashMapTest {

    @Test
    void test1() {

        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        var v1 = myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
        Assertions.assertThat(v1).isEqualTo(1);
        var v2 = myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        Assertions.assertThat(v2).isEqualTo(-1);
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        var v3 = myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
        Assertions.assertThat(v3).isEqualTo(1);
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        var v4 = myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
        Assertions.assertThat(v4).isEqualTo(-1);

    }
}