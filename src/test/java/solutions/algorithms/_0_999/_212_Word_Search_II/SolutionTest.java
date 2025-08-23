package solutions.algorithms._0_999._212_Word_Search_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        char[][] board = new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] words = new String[]{"oath", "pea", "eat", "rain"};

        List<String> answer = solution.findWords(board, words);

        List<String> expected = List.of("eat", "oath");
        Assertions.assertThat(answer).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test2() {
        char[][] board = new char[][]{{'a', 'b'}, {'c', 'd'}};
        String[] words = new String[]{"abcd"};

        List<String> answer = solution.findWords(board, words);

        Assertions.assertThat(answer).hasSize(0);
    }

    @Test
    void test3() {
        char[][] board = new char[][]{{'o','a','b','n'},{'o','t','a','e'},{'a','h','k','r'},{'a','f','l','v'}};
        String[] words = new String[]{"oa", "oaa"};

        List<String> answer = solution.findWords(board, words);

        List<String> expected = List.of("oa", "oaa");
        Assertions.assertThat(answer).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test4() {
        char[][] board = new char[][]{{'a','a'}};
        String[] words = new String[]{"aaa"};

        List<String> answer = solution.findWords(board, words);

        List<String> expected = List.of();
        Assertions.assertThat(answer).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void test5() {
        char[][] board = new char[][]{{'a','b','c','e'},{'x','x','c','d'},{'x','x','b','a'}};
        String[] words = new String[]{"abc", "abcd"};

        List<String> answer = solution.findWords(board, words);

        List<String> expected = List.of("abc", "abcd");
        Assertions.assertThat(answer).containsExactlyInAnyOrderElementsOf(expected);
    }

    // time limit exceeded case
    // let's check what is slow
    // I added return in the case where there are no words to find
    @Test
    void test6() {
        char[][] board = new char[][]{{'a','a','a','a','a','a','a','a','a','a','a','a'},{'a','a','a','a','a','a','a','a','a','a','a','a'},{'a','a','a','a','a','a','a','a','a','a','a','a'},{'a','a','a','a','a','a','a','a','a','a','a','a'},{'a','a','a','a','a','a','a','a','a','a','a','a'},{'a','a','a','a','a','a','a','a','a','a','a','a'},{'a','a','a','a','a','a','a','a','a','a','a','a'},{'a','a','a','a','a','a','a','a','a','a','a','a'},{'a','a','a','a','a','a','a','a','a','a','a','a'},{'a','a','a','a','a','a','a','a','a','a','a','a'},{'a','a','a','a','a','a','a','a','a','a','a','a'},{'a','a','a','a','a','a','a','a','a','a','a','a'}};
        String[] words = new String[]{"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"};

        List<String> answer = solution.findWords(board, words);

        List<String> expected = List.of("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        Assertions.assertThat(answer).containsExactlyInAnyOrderElementsOf(expected);
    }
}