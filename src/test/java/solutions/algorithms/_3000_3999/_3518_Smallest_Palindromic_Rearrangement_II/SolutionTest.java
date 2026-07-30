package solutions.algorithms._3000_3999._3518_Smallest_Palindromic_Rearrangement_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void smallestPalindrome1() {
        String s = "abba";
        int k = 2;
        String answer = solution.smallestPalindrome(s, k);
        Assertions.assertThat(answer).isEqualTo("baab");
    }

    @Test
    void smallestPalindrome2() {
        String s = "aa";
        int k = 2;
        String answer = solution.smallestPalindrome(s, k);
        Assertions.assertThat(answer).isEqualTo("");
    }

    @Test
    void smallestPalindrome3() {
        String s = "bacab";
        int k = 1;
        String answer = solution.smallestPalindrome(s, k);
        Assertions.assertThat(answer).isEqualTo("abcba");
    }

    @Test
    void smallestPalindrome4() {
        String s = "dmtmd";
        int k = 3;
        String answer = solution.smallestPalindrome(s, k);
        Assertions.assertThat(answer).isEqualTo("");
    }

    @Test
    void smallestPalindrome5() {
        String s = "xdekcjfqsfqxdibvmxyksvpwxyizwnvzswlmqacmzfnsoionxzpphznnpwjhupsssihnabwizgwagdlvmudavojuwlbtzjxmgrpgdawuywvlchxrsiqaupgoicprzvibcedknousickwhftmxgimzumdlqyqlqsznsfpezjmlsfysppysnrvmcwzrrwjbfbdkhhccuqtrsxapwoiiufdazqrzoswduliyvzewszaeowwoanvvzpiyqakxquvirrxutcdilztrceikqbvpndlqddrcspiqkkolyfgdyrqgbhrbyntjunmgwzkjnabquamrkwzqnzadynixfvpelmypqlczplherjuerqcirhvbiggxgwitkmlmkibxhbvbcarjhlaipvsioggzzzmfgwcddhsitatewkwynbbfylfkalhpkywfasorrqrrosafwykphlakflyfbbnywkwetatishddcwgfmzzzggoisvpialhjracbvbhxbikmlmktiwgxggibvhricqreujrehlpzclqpymlepvfxinydaznqzwkrmauqbanjkzwgmnujtnybrhbgqrydgfylokkqipscrddqldnpvbqkiecrtzlidctuxrrivuqxkaqyipzvvnaowwoeazswezvyiludwsozrqzadfuiiowpaxsrtqucchhkdbfbjwrrzwcmvrnsyppsyfslmjzepfsnzsqlqyqldmuzmigxmtfhwkcisuonkdecbivzrpciogpuaqisrxhclvwyuwadgprgmxjztblwujovadumvldgawgziwbanhissspuhjwpnnzhppzxnoiosnfzmcaqmlwszvnwziyxwpvskyxmvbidxqfsqfjckedx";
        int k = 298603;
        String answer = solution.smallestPalindrome(s, k);
        Assertions.assertThat(answer).isEqualTo("aaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbccccccccccccccccddddddddddddddddddeeeeeeeeeeffffffffffffffggggggggggggggghhhhhhhhhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiijjjjjjjjjjkkkkkkkkkkkkkkkkllllllllllllllllllmmmmmmmmmmmmmmmmnnnnnnnnnnnnnnnnnooooooooooooppppppppppppppppppppqqqqqqqqqqqqqqqqqqqrrrrrrrrrrrrrrrrrrrrrssssssssssssssssssssstttttttttuuuuuuuuuuuuuuuvvvvvvvvvvvvvvvvvwwwwwwwwwwwwwwwwwwwwwwwwxxxxxxxxxxxxxxyyyyyyyyyyzzyzzyzzyzzzzzzyzzzzzyzzzzzzyzzqzzyzzzzzzyzzzzzyzzzzzzyzzyzzyzzyyyyyyyyyyxxxxxxxxxxxxxxwwwwwwwwwwwwwwwwwwwwwwwwvvvvvvvvvvvvvvvvvuuuuuuuuuuuuuuutttttttttsssssssssssssssssssssrrrrrrrrrrrrrrrrrrrrrqqqqqqqqqqqqqqqqqqqppppppppppppppppppppoooooooooooonnnnnnnnnnnnnnnnnmmmmmmmmmmmmmmmmllllllllllllllllllkkkkkkkkkkkkkkkkjjjjjjjjjjiiiiiiiiiiiiiiiiiiiiiiiiiihhhhhhhhhhhhhhgggggggggggggggffffffffffffffeeeeeeeeeeddddddddddddddddddccccccccccccccccbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaa");
    }
}