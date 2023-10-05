package solutions.algorithms._412_Fizz_Buzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void fizzBuzzTest1() {
        List<String> actual = solution.fizzBuzz(3);
        Assertions.assertThat(actual).containsExactly("1", "2", "Fizz");
    }

    @Test
    void fizzBuzzTest2() {
        List<String> actual = solution.fizzBuzz(5);
        Assertions.assertThat(actual).containsExactly("1", "2", "Fizz", "4", "Buzz");
    }

    @Test
    void fizzBuzzTest3() {
        List<String> actual = solution.fizzBuzz(15);
        Assertions.assertThat(actual).containsExactly("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                "14", "FizzBuzz");
    }
}