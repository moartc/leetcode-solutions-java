package solutions.algorithms._0_999._432_All_O_one_Data_Structure;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AllOneTest {

    @Test
    void test1() {

        AllOne allOne = new AllOne();
        allOne.inc("hello");
        allOne.inc("hello");
        String a1 = allOne.getMaxKey();// return "hello"
        String a2 = allOne.getMinKey();// return "hello"
        allOne.inc("leet");
        String a3 = allOne.getMaxKey();// return "hello"
        String a4 = allOne.getMinKey();// return "leet"

        Assertions.assertThat(a1).isEqualTo("hello");
        Assertions.assertThat(a2).isEqualTo("hello");
        Assertions.assertThat(a3).isEqualTo("hello");
        Assertions.assertThat(a4).isEqualTo("leet");
    }

    @Test
    void test2() {

        AllOne allOne = new AllOne();
        allOne.inc("a");
        allOne.inc("a");
        Assertions.assertThat(allOne.getMaxKey()).isEqualTo("a");
        Assertions.assertThat(allOne.getMinKey()).isEqualTo("a");
        allOne.inc("b");
        Assertions.assertThat(allOne.getMaxKey()).isEqualTo("a");
        Assertions.assertThat(allOne.getMinKey()).isEqualTo("b");
        allOne.inc("b");
        allOne.inc("b");
        Assertions.assertThat(allOne.getMaxKey()).isEqualTo("b");
        Assertions.assertThat(allOne.getMinKey()).isEqualTo("a");
        allOne.inc("c");
        allOne.inc("c");
        allOne.inc("c");
        allOne.inc("c");
        Assertions.assertThat(allOne.getMaxKey()).isEqualTo("c");
    }

    @Test
    void test3() {

        AllOne allOne = new AllOne();
        allOne.inc("a");
        allOne.inc("a");
        Assertions.assertThat(allOne.getMinKey()).isEqualTo("a");
        allOne.inc("b");
        allOne.inc("b");
        allOne.inc("b");
        allOne.inc("b");
        Assertions.assertThat(allOne.getMaxKey()).isEqualTo("b");
        Assertions.assertThat(allOne.getMinKey()).isEqualTo("a");
        allOne.inc("c");
        allOne.inc("c");
        allOne.inc("c");
        allOne.inc("c");
        allOne.inc("c");
        allOne.inc("c");
        Assertions.assertThat(allOne.getMaxKey()).isEqualTo("c");
        allOne.dec("c");
        allOne.dec("c");
        Assertions.assertThat(allOne.getMaxKey()).isEqualTo("c");
        Assertions.assertThat(allOne.getMinKey()).isEqualTo("a");
        allOne.dec("c");
        allOne.dec("c");
        allOne.dec("c");
        Assertions.assertThat(allOne.getMinKey()).isEqualTo("c");
        allOne.dec("c");
        Assertions.assertThat(allOne.getMinKey()).isEqualTo("a");
    }

    @Test
    void test4() {
        AllOne allOne = new AllOne();
        allOne.inc("a");
        allOne.inc("b");
        allOne.inc("b");
        allOne.inc("c");
        allOne.inc("c");
        allOne.inc("c");
        allOne.dec("b");
        allOne.dec("b");
        String v1 = allOne.getMinKey();
        allOne.dec("a");
        String v2 = allOne.getMaxKey();
        String v3 = allOne.getMinKey();
        Assertions.assertThat(v1).isEqualTo("a");
        Assertions.assertThat(v2).isEqualTo("c");
        Assertions.assertThat(v3).isEqualTo("c");
    }

    @Test
    void test5() {
        AllOne allOne = new AllOne();
        allOne.inc("a");
        allOne.inc("a");
        allOne.inc("a");
        allOne.inc("a");
        allOne.inc("b");
        Assertions.assertThat(allOne.getMinKey()).isEqualTo("b");
        allOne.dec("b");
        Assertions.assertThat(allOne.getMinKey()).isEqualTo("a");
        allOne.inc("b");
        Assertions.assertThat(allOne.getMinKey()).isEqualTo("b");
    }
}