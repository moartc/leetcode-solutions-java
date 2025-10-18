package solutions.algorithms._0_999._705_Design_HashSet;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MyHashSetTest {

    @Test
    void test() {

        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        boolean c1 = myHashSet.contains(1);
        boolean c2 = myHashSet.contains(3);
        myHashSet.add(2);
        boolean c3 = myHashSet.contains(2);
        myHashSet.remove(2);
        boolean c4 = myHashSet.contains(2);

        Assertions.assertThat(c1).isTrue();
        Assertions.assertThat(c2).isFalse();
        Assertions.assertThat(c3).isTrue();
        Assertions.assertThat(c4).isFalse();
    }
}