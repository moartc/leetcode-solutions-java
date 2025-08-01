package solutions.algorithms._0_999._981_Time_Based_Key_Value_Store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeMapTest {

    @Test
    void test1() {

        TimeMap timeMap = new TimeMap();
        // store the key "foo" and value "bar" along with timestamp = 1.
        timeMap.set("foo", "bar", 1);

        // return "bar"
        String v1 = timeMap.get("foo", 1);
        Assertions.assertThat(v1).isEqualTo("bar");

        // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
        String v2 = timeMap.get("foo", 3);
        Assertions.assertThat(v2).isEqualTo("bar");

        // store the key "foo" and value "bar2" along with timestamp = 4.
        timeMap.set("foo", "bar2", 4);

        // return "bar2"
        String v3 = timeMap.get("foo", 4);
        Assertions.assertThat(v3).isEqualTo("bar2");

        // return "bar2"
        String v4 = timeMap.get("foo", 5);
        Assertions.assertThat(v4).isEqualTo("bar2");
    }
}