package solutions.utils;

import commons.ListNode;
import org.junit.jupiter.api.Assertions;

public class ListNodeAssertions {

    public static void listsEquals(ListNode expected, ListNode actual) {
        while (expected.next != null) {
            int expectedCurrentValue = expected.val;
            int actualCurrentValue = actual.val;
            Assertions.assertEquals(expectedCurrentValue, actualCurrentValue);
            expected = expected.next;
            actual = actual.next;
        }
        Assertions.assertNull(actual.next);
    }
}
