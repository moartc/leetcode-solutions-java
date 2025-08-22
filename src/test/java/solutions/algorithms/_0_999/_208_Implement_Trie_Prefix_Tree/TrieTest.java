package solutions.algorithms._0_999._208_Implement_Trie_Prefix_Tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TrieTest {

    @Test
    void test1() {

        Trie trie = new Trie();
        trie.insert("apple");
        boolean v1 = trie.search("apple");// return True
        boolean v2 = trie.search("app");// return False
        boolean v3 = trie.startsWith("app");// return True
        trie.insert("app");
        boolean v4 = trie.search("app");// return True

        Assertions.assertThat(v1).isTrue();
        Assertions.assertThat(v2).isFalse();
        Assertions.assertThat(v3).isTrue();
        Assertions.assertThat(v4).isTrue();
    }
}