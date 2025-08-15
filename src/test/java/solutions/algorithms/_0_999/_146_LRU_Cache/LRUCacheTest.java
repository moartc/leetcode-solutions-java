package solutions.algorithms._0_999._146_LRU_Cache;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LRUCacheTest {

    @Test
    void test1() {

        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        int v1 = lRUCache.get(1);// return 1
        Assertions.assertThat(v1).isEqualTo(1);

        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        int v2 = lRUCache.get(2);// returns -1 (not found)
        Assertions.assertThat(v2).isEqualTo(-1);

        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        int v3 = lRUCache.get(1);// return -1 (not found)
        Assertions.assertThat(v3).isEqualTo(-1);

        int v4 = lRUCache.get(3);// return 3
        Assertions.assertThat(v4).isEqualTo(3);

        int v5 = lRUCache.get(4);// return 4
        Assertions.assertThat(v5).isEqualTo(4);
    }

    @Test
    void test2() {

        LRUCache lRUCache = new LRUCache(1);
        lRUCache.put(2, 1); // cache is {2=1}
        int v1 = lRUCache.get(2);// return 1
        Assertions.assertThat(v1).isEqualTo(1);
    }

    @Test
    void test3() {

        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 0);
        lRUCache.put(2, 2);
        var v1 = lRUCache.get(1);
        Assertions.assertThat(v1).isEqualTo(0);
        lRUCache.put(3, 3);
        var v2 = lRUCache.get(2);
        Assertions.assertThat(v2).isEqualTo(-1);
        lRUCache.put(4, 4);
        var v3 = lRUCache.get(1);
        Assertions.assertThat(v3).isEqualTo(-1);
        var v4 = lRUCache.get(3);
        Assertions.assertThat(v4).isEqualTo(3);
        var v5 = lRUCache.get(4);
        Assertions.assertThat(v5).isEqualTo(4);
    }

    @Test
    void test4() {

        LRUCache lRUCache = new LRUCache(1);
        lRUCache.put(2, 1);
        var v1 = lRUCache.get(2);
        Assertions.assertThat(v1).isEqualTo(1);
        lRUCache.put(3, 2);
        var v2 = lRUCache.get(2);
        Assertions.assertThat(v2).isEqualTo(-1);
        var v3 = lRUCache.get(3);
        Assertions.assertThat(v3).isEqualTo(2);
    }

    @Test
    void test5() {

        LRUCache lRUCache = new LRUCache(2);
        var v1 = lRUCache.get(2);
        Assertions.assertThat(v1).isEqualTo(-1);

        lRUCache.put(2, 6);

        var v2 = lRUCache.get(1);
        Assertions.assertThat(v2).isEqualTo(-1);

        lRUCache.put(1, 5);

        lRUCache.put(1, 2);

        var v3 = lRUCache.get(1);
        Assertions.assertThat(v3).isEqualTo(2);
        var v4 = lRUCache.get(2);
        Assertions.assertThat(v4).isEqualTo(6);
    }

    @Test
    void test6() {

        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(2, 1);
        lRUCache.put(1, 1);
        lRUCache.put(2, 3);
        lRUCache.put(4, 1);

        var v1 = lRUCache.get(1);
        Assertions.assertThat(v1).isEqualTo(-1);

        var v2 = lRUCache.get(2);
        Assertions.assertThat(v2).isEqualTo(3);
    }
}