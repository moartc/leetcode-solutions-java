package solutions.algorithms._1000_1999._1032_Stream_of_Characters;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StreamCheckerTest {

    @Test
    void query1() {
        String[] words = new String[]{"cd", "f", "kl"};
        StreamChecker streamChecker = new StreamChecker(words);
        boolean a = streamChecker.query('a');
        boolean b = streamChecker.query('b');
        boolean c = streamChecker.query('c');
        boolean d = streamChecker.query('d');
        boolean e = streamChecker.query('e');
        boolean f = streamChecker.query('f');
        boolean g = streamChecker.query('g');
        boolean h = streamChecker.query('h');
        boolean i = streamChecker.query('i');
        boolean j = streamChecker.query('j');
        boolean k = streamChecker.query('k');
        boolean l = streamChecker.query('l');
        Assertions.assertThat(a).isFalse();
        Assertions.assertThat(b).isFalse();
        Assertions.assertThat(c).isFalse();
        Assertions.assertThat(d).isTrue();
        Assertions.assertThat(e).isFalse();
        Assertions.assertThat(f).isTrue();
        Assertions.assertThat(g).isFalse();
        Assertions.assertThat(h).isFalse();
        Assertions.assertThat(i).isFalse();
        Assertions.assertThat(j).isFalse();
        Assertions.assertThat(k).isFalse();
        Assertions.assertThat(l).isTrue();
    }
}