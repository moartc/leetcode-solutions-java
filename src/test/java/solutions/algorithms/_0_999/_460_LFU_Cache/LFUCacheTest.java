package solutions.algorithms._0_999._460_LFU_Cache;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LFUCacheTest {

    @Test
    void test1() {

        LFUCache lfu = new LFUCache(2);
        lfu.put(1, 1);          // cache=[1,_], cnt(1)=1
        lfu.put(2, 2);          // cache=[2,1], cnt(2)=1, cnt(1)=1
        int g1 = lfu.get(1);    // return 1
        // cache=[1,2], cnt(2)=1, cnt(1)=2
        lfu.put(3, 3);          // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
        // cache=[3,1], cnt(3)=1, cnt(1)=2
        int g2 = lfu.get(2);    // return -1 (not found)
        int g3 = lfu.get(3);    // return 3
        // cache=[3,1], cnt(3)=2, cnt(1)=2
        lfu.put(4, 4);          // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
        // cache=[4,3], cnt(4)=1, cnt(3)=2
        int g4 = lfu.get(1);    // return -1 (not found)
        int g5 = lfu.get(3);    // return 3
        // cache=[3,4], cnt(4)=1, cnt(3)=3
        int g6 = lfu.get(4);    // return 4
        // cache=[4,3], cnt(4)=2, cnt(3)=3

        Assertions.assertThat(g1).isEqualTo(1);
        Assertions.assertThat(g2).isEqualTo(-1);
        Assertions.assertThat(g3).isEqualTo(3);
        Assertions.assertThat(g4).isEqualTo(-1);
        Assertions.assertThat(g5).isEqualTo(3);
        Assertions.assertThat(g6).isEqualTo(4);
    }

    @Test
    void test2() {

        LFUCache lfu = new LFUCache(3);
        lfu.put(2, 2);          // cache=[2,_,_], cnt(2)=1
        lfu.put(1, 1);          // cache=[2,1,_], cnt(2)=1 , cnt(1)=1
        int g1 = lfu.get(2);
        // cache=[2,1,_], cnt(2)=2 , cnt(1)=1
        int g2 = lfu.get(1);
        // cache=[2,1,_], cnt(2)=2 , cnt(1)=2
        int g3 = lfu.get(2);
        // cache=[2,1,_], cnt(1)=2, cnt(2)=3
        lfu.put(3, 3);  // cache=[2,1,3], cnt(1)=2, cnt(2)=3, cnt(3)=1
        lfu.put(4, 4);  // invalidate 3, cache=[2,1,4], cnt(1)=2, cnt(2)=3, cnt(4)=1
        int g4 = lfu.get(3); // return -1
        int g5 = lfu.get(2); // return 2
        // cache=[2,1,4], cnt(1)=2, cnt(2)=4, cnt(4)=1
        int g6 = lfu.get(1); // return 1
        // cache=[2,1,4], cnt(2)=3, cnt(1)=3, cnt(4)=1
        int g7 = lfu.get(4);  // return 4
        // cache=[2,1,4], cnt(2)=3, cnt(1)=3, cnt(4)=2

        Assertions.assertThat(g1).isEqualTo(2);
        Assertions.assertThat(g2).isEqualTo(1);
        Assertions.assertThat(g3).isEqualTo(2);
        Assertions.assertThat(g4).isEqualTo(-1);
        Assertions.assertThat(g5).isEqualTo(2);
        Assertions.assertThat(g6).isEqualTo(1);
        Assertions.assertThat(g7).isEqualTo(4);
    }
}