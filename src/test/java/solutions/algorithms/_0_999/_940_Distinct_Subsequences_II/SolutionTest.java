package solutions.algorithms._0_999._940_Distinct_Subsequences_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void distinctSubseqII1() {
        String s = "abc";
        int answer = solution.distinctSubseqII(s);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void distinctSubseqII2() {
        String s = "aba";
        int answer = solution.distinctSubseqII(s);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void distinctSubseqII3() {
        String s = "aaa";
        int answer = solution.distinctSubseqII(s);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void distinctSubseqII4() {
        String s = "yezruvnatuipjeohsymapyxgfeczkevoxipckunlqjauvllfpwezhlzpbkfqazhexabomnlxkmoufneninbxxguuktvupmpfspwxiouwlfalexmluwcsbeqrzkivrphtpcoxqsueuxsalopbsgkzaibkpfmsztkwommkvgjjdvvggnvtlwrllcafhfocprnrzfoyehqhrvhpbbpxpsvomdpmksojckgkgkycoynbldkbnrlujegxotgmeyknpmpgajbgwmfftuphfzrywarqkpkfnwtzgdkdcyvwkqawwyjuskpvqomfchnlojmeltlwvqomucipcwxkgsktjxpwhujaexhejeflpctmjpuguslmzvpykbldcbxqnwgycpfccgeychkxfopixijeypzyryglutxweffyrqtkfrqlhtjweodttchnugybsmacpgperznunffrdavyqgilqlplebbkdopyyxcoamfxhpmdyrtutfxsejkwiyvdwggyhgsdpfxpznrccwdupfzlubkhppmasdbqfzttbhfismeamenyukzqoupbzxashwuvfkmkosgevcjnlpfgxgzumktsexvwhylhiupwfwyxotwnxodttsrifgzkkedurayjgxlhxjzlxikcgerptpufocymfrkyayvklsalgmtifpiczwnozmgowzchjiop";
        int answer = solution.distinctSubseqII(s);
        Assertions.assertThat(answer).isEqualTo(1000000006);
    }

}