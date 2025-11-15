package solutions.algorithms._0_999._895_Maximum_Frequency_Stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FreqStackTest {

    @Test
    void test1() {
        FreqStack freqStack = new FreqStack();
        freqStack.push(5); // The stack is [5]
        freqStack.push(7); // The stack is [5,7]
        freqStack.push(5); // The stack is [5,7,5]
        freqStack.push(7); // The stack is [5,7,5,7]
        freqStack.push(4); // The stack is [5,7,5,7,4]
        freqStack.push(5); // The stack is [5,7,5,7,4,5]
        int pop1 = freqStack.pop();// return 5, as 5 is the most frequent. The stack becomes [5,7,5,7,4].
        int pop2 = freqStack.pop();   // return 7, as 5 and 7 is the most frequent, but 7 is closest to the top. The stack becomes [5,7,5,4].
        int pop3 = freqStack.pop();   // return 5, as 5 is the most frequent. The stack becomes [5,7,4].
        int pop4 = freqStack.pop();   // return 4, as 4, 5 and 7 is the most frequent, but 4 is closest to the top. The stack becomes [5,7].

        Assertions.assertThat(pop1).isEqualTo(5);
        Assertions.assertThat(pop2).isEqualTo(7);
        Assertions.assertThat(pop3).isEqualTo(5);
        Assertions.assertThat(pop4).isEqualTo(4);
    }

    @Test
    void test2() {
        FreqStack freqStack = new FreqStack();
        freqStack.push(4);
        freqStack.push(0);
        freqStack.push(9);
        freqStack.push(3);
        freqStack.push(4);
        freqStack.push(2);
        int pop1 = freqStack.pop();
        freqStack.push(6);
        int pop2 = freqStack.pop();
        freqStack.push(1);
        int pop3 = freqStack.pop();
        freqStack.push(1);
        int pop4 = freqStack.pop();
        freqStack.push(4);
        int pop5 = freqStack.pop();
        int pop6 = freqStack.pop();
        int pop7 = freqStack.pop();
        int pop8 = freqStack.pop();
        int pop9 = freqStack.pop();
        int pop10 = freqStack.pop();

        Assertions.assertThat(pop1).isEqualTo(4);
        Assertions.assertThat(pop2).isEqualTo(6);
        Assertions.assertThat(pop3).isEqualTo(1);
        Assertions.assertThat(pop4).isEqualTo(1);
        Assertions.assertThat(pop5).isEqualTo(4);
        Assertions.assertThat(pop6).isEqualTo(2);
        Assertions.assertThat(pop7).isEqualTo(3);
        Assertions.assertThat(pop8).isEqualTo(9);
        Assertions.assertThat(pop9).isEqualTo(0);
        Assertions.assertThat(pop10).isEqualTo(4);
    }
}