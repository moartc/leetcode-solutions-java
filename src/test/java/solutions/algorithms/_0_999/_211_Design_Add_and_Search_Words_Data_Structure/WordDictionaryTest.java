package solutions.algorithms._0_999._211_Design_Add_and_Search_Words_Data_Structure;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WordDictionaryTest {

    @Test
    void test1() {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        boolean v1 = wordDictionary.search("pad");// return False
        boolean v2 = wordDictionary.search("bad");// return True
        boolean v3 = wordDictionary.search(".ad");// return True
        boolean v4 = wordDictionary.search("b..");// return True

        Assertions.assertThat(v1).isFalse();
        Assertions.assertThat(v2).isTrue();
        Assertions.assertThat(v3).isTrue();
        Assertions.assertThat(v4).isTrue();
    }
}