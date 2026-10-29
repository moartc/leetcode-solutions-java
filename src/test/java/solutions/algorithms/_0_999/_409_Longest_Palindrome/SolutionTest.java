package solutions.algorithms._0_999._409_Longest_Palindrome;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestPalindrome() {
        String s = "abccccdd";
        int answer = solution.longestPalindrome(s);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void longestPalindrom2() {
        String s = "a";
        int answer = solution.longestPalindrome(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void longestPalindrom3() {
        String s = "ABCCCCDD";
        int answer = solution.longestPalindrome(s);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void longestPalindrom4() {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        int answer = solution.longestPalindrome(s);
        Assertions.assertThat(answer).isEqualTo(983);
    }
}