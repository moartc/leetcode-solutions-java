package solutions.algorithms._0_999._756_Pyramid_Transition_Matrix;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void pyramidTransition1() {
        String bottom = "BCD";
        List<String> allowed = List.of("BCC", "CDE", "CEA", "FFF");
        boolean answer = solution.pyramidTransition(bottom, allowed);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void pyramidTransition2() {
        String bottom = "AAAA";
        List<String> allowed = List.of("AAB", "AAC", "BCD", "BBE", "DEF");
        boolean answer = solution.pyramidTransition(bottom, allowed);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void pyramidTransition3() {
        /*
        for example
          C
         D A
        A B C
         */

        String bottom = "ABC";
        List<String> allowed = List.of("ABD", "ABE", "BCF", "BCA", "DAC", "EFC");
        boolean answer = solution.pyramidTransition(bottom, allowed);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void pyramidTransition4() {
        // TLE test case
        String bottom = "AFFFFA";
        List<String> allowed = List.of("ADA", "ADC", "ADB", "AEA", "AEC", "AEB", "AFA", "AFC", "AFB", "CDA", "CDC", "CDB", "CEA", "CEC",
                "CEB", "CFA", "CFC", "CFB", "BDA", "BDC", "BDB", "BEA", "BEC", "BEB", "BFA", "BFC", "BFB", "DAA", "DAC", "DAB", "DCA",
                "DCC", "DCB", "DBA", "DBC", "DBB", "EAA", "EAC", "EAB", "ECA", "ECC", "ECB", "EBA", "EBC", "EBB", "FAA", "FAC", "FAB",
                "FCA", "FCC", "FCB", "FBA", "FBC", "FBB", "DDA", "DDC", "DDB", "DEA", "DEC", "DEB", "DFA", "DFC", "DFB", "EDA", "EDC",
                "EDB", "EEA", "EEC", "EEB", "EFA", "EFC", "EFB", "FDA", "FDC", "FDB", "FEA", "FEC", "FEB", "FFA", "FFC", "FFB", "DDD",
                "DDE", "DDF", "DED", "DEE", "DEF", "DFD", "DFE", "DFF", "EDD", "EDE", "EDF", "EED", "EEE", "EEF", "EFD", "EFE", "EFF",
                "FDD", "FDE", "FDF", "FED", "FEE", "FEF", "FFD", "FFE", "FFF");
        boolean answer = solution.pyramidTransition(bottom, allowed);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void pyramidTransition5() {
        String bottom = "ABC";
        List<String> allowed = List.of("ABC", "ABD", "ABE", "ABF", "BCA", "BCB", "BCC", "BCD", "BCE", "BCF", "DDA");
        boolean answer = solution.pyramidTransition(bottom, allowed);
        Assertions.assertThat(answer).isTrue();
    }
}